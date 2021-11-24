package methodoverloading;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    Time t;
    Time t2;
    Time t3;

    @BeforeEach
    void init () {
        t = new Time(21, 11, 10);
        t2 = new Time(21, 11, 10);
        t3 = new Time(23, 11, 10);
    }

    @Test
    void testIsEqualTime () {
        assertTrue(t.isEqual(t2));
        assertFalse(t.isEqual(t3));
    }

    @Test
    void testIsEqualHourMinSec () {
        assertTrue(t.isEqual(21, 11, 10));
        assertFalse(t.isEqual(23, 12, 5));
    }

}