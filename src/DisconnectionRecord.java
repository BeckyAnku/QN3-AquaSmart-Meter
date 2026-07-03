public class DisconnectionRecord {
    private String meterId;
    private int hoursDisconnected;

    public DisconnectionRecord(String meterId) {
        this.meterId = meterId;
        this.hoursDisconnected = 0;
    }

    public void addDisconnectedHours(int hours) {
        if (hours > 0) {
            hoursDisconnected = hoursDisconnected + hours;
        }
    }

    public String getMeterId() {
        return meterId;
    }

    public int getHoursDisconnected() {
        return hoursDisconnected;
    }
}
