package initializer.creditcar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateTest {

    @Test
    void testvalutaRate() {
        Rate rate = new Rate();
        assertEquals(1000, rate.valutaRate(1000, Currency.HUF));
        assertEquals(365_800, rate.valutaRate(1000, Currency.EUR));
        assertEquals(329_200, rate.valutaRate(1000, Currency.USD));
    }

}