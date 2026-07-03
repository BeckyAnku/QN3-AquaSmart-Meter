public class SmartMeter {
    private String meterId;
    private double creditBalance;
    private boolean valveOpen;

    public SmartMeter(String meterId, double openingCreditBalance) {
        this.meterId = meterId;
        this.creditBalance = openingCreditBalance;
        this.valveOpen = true;
    }

    public double loadToken(double amount) {
        if (amount > 0) {
            this.creditBalance = this.creditBalance + amount;
            this.valveOpen = true;
        }

        return this.creditBalance;
    }

    public boolean recordConsumption(double litres) {
        boolean waterDispensed = false;

        if (this.valveOpen == true && this.creditBalance > 0) {
            double charge = litres * 50;
            this.creditBalance = this.creditBalance - charge;
            waterDispensed = true;

            if (this.creditBalance <= 0) {
                this.creditBalance = 0;
                this.valveOpen = false;
            }
        }

        return waterDispensed;
    }

    public String getMeterId() {
        return this.meterId;
    }

    public double getCreditBalance() {
        return this.creditBalance;
    }

    public boolean isValveOpen() {
        return this.valveOpen;
    }
}
