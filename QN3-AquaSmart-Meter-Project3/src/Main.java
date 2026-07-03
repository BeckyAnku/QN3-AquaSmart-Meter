public class Main {
    public static void main(String[] args) {
        SmartMeter islandMeter = new SmartMeter("KIS-LUTOBOKA-303", 1000);

        System.out.println("AquaSmart prepaid water meter");
        System.out.println("Meter number: " + islandMeter.getMeterId());
        System.out.println("Credit before use: UGX " + islandMeter.getCreditBalance());
        System.out.println();

        System.out.println("Customer uses 30 litres.");
        System.out.println("Water dispensed: " + islandMeter.recordConsumption(30));
        System.out.println("Credit after use: UGX " + islandMeter.getCreditBalance());
        System.out.println("Valve open: " + islandMeter.isValveOpen());
        System.out.println();

        System.out.println("Customer buys a fresh token of UGX 5000.");
        islandMeter.loadToken(5000);
        System.out.println("Credit after token: UGX " + islandMeter.getCreditBalance());
        System.out.println("Valve open: " + islandMeter.isValveOpen());
    }
}
