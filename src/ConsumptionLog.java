public class ConsumptionLog {
    private String logId;
    private double litres;
    private boolean accepted;

    public ConsumptionLog(String logId, double litres, boolean accepted) {
        this.logId = logId;
        this.litres = litres;
        this.accepted = accepted;
    }

    public double calculateCost() {
        return litres * 50;
    }

    public String getLogId() {
        return logId;
    }

    public double getLitres() {
        return litres;
    }

    public boolean isAccepted() {
        return accepted;
    }
}
