import org.junit.Test;
import static org.junit.Assert.*;

public class SmartMeterTest {
    @Test
    public void loadTokenReopensClosedMeterValve() {
        SmartMeter meter = new SmartMeter("UNIT-300", 100);
        meter.recordConsumption(3);

        assertFalse(meter.isValveOpen());

        meter.loadToken(700);

        assertTrue(meter.isValveOpen());
    }

    @Test
    public void consumptionPastCreditMakesValveClose() {
        SmartMeter meter = new SmartMeter("UNIT-301", 250);

        boolean dispensed = meter.recordConsumption(6);

        assertTrue(dispensed);
        assertEquals(0, meter.getCreditBalance(), 0.01);
        assertFalse(meter.isValveOpen());
    }
}
