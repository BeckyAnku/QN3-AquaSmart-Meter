public class Main {
    public static void main(String[] args) {
        SmartMeter islandMeter = new SmartMeter("KIS-LUTOBOKA-303", 1000);
        WaterCustomer customer = new WaterCustomer("Becky G. Namayanja", "Lutoboka Parish", islandMeter);
        LeakDetector detector = new LeakDetector(500);
        DisconnectionRecord record = new DisconnectionRecord(islandMeter.getMeterId());

        System.out.println("AquaSmart prepaid water meter");
        System.out.println("Customer: " + customer.getAccountName());
        System.out.println("Parish: " + customer.getParish());
        System.out.println("Meter number: " + customer.getHomeMeter().getMeterId());
        System.out.println("Credit before use: UGX " + islandMeter.getCreditBalance());
        System.out.println();

        System.out.println("Customer uses 30 litres.");
        boolean accepted = islandMeter.recordConsumption(30);
        ConsumptionLog normalLog = new ConsumptionLog("LOG-303-A", 30, accepted);
        System.out.println("Water dispensed: " + normalLog.isAccepted());
        System.out.println("Cost: UGX " + normalLog.calculateCost());
        System.out.println("Credit after use: UGX " + islandMeter.getCreditBalance());
        System.out.println("Valve open: " + islandMeter.isValveOpen());
        System.out.println();

        if (islandMeter.isValveOpen() == false) {
            record.addDisconnectedHours(2);
        }

        System.out.println("Customer buys a fresh token of UGX 5000.");
        MobileMoneyToken token = new MobileMoneyToken("MTN-303-888", 5000, "MTN Mobile Money");
        token.loadCredit(islandMeter);
        System.out.println("Token transaction: " + token.getTransactionId());
        System.out.println("Payment network: " + token.getNetwork());
        System.out.println("Credit after token: UGX " + islandMeter.getCreditBalance());
        System.out.println("Valve open: " + islandMeter.isValveOpen());
        System.out.println();

        ConsumptionLog heavyLog = new ConsumptionLog("LOG-303-B", 650, true);
        System.out.println("Heavy flow litres: " + heavyLog.getLitres());
        System.out.println("Leak limit: " + detector.getLimitLitres());
        System.out.println("Possible leak? " + detector.hasPossibleLeak(heavyLog));
        System.out.println("Hours disconnected: " + record.getHoursDisconnected());
    }
}
