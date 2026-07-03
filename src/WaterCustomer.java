public class WaterCustomer {
    private String accountName;
    private String parish;
    private SmartMeter homeMeter;

    public WaterCustomer(String accountName, String parish, SmartMeter homeMeter) {
        this.accountName = accountName;
        this.parish = parish;
        this.homeMeter = homeMeter;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getParish() {
        return parish;
    }

    public SmartMeter getHomeMeter() {
        return homeMeter;
    }
}
