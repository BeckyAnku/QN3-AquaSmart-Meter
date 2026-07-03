public class MobileMoneyToken {
    private String transactionId;
    private double creditAmount;
    private String network;

    public MobileMoneyToken(String transactionId, double creditAmount, String network) {
        this.transactionId = transactionId;
        this.creditAmount = creditAmount;
        this.network = network;
    }

    public double loadCredit(SmartMeter smartMeter) {
        double balanceAfterLoading = smartMeter.loadToken(creditAmount);
        return balanceAfterLoading;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getCreditAmount() {
        return creditAmount;
    }

    public String getNetwork() {
        return network;
    }
}
