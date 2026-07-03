public class LeakDetector {
    private double limitLitres;

    public LeakDetector(double limitLitres) {
        this.limitLitres = limitLitres;
    }

    public boolean hasPossibleLeak(ConsumptionLog log) {
        if (log.getLitres() > limitLitres) {
            return true;
        }

        return false;
    }

    public double getLimitLitres() {
        return limitLitres;
    }
}
