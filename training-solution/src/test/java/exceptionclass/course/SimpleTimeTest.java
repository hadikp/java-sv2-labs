package exceptionclass.course;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTimeTest {

    SimpleTime simpleTime;

    @BeforeEach
    void init() {
        simpleTime = new SimpleTime(23, 22);
    }

    @Test
    void testGetTime() {
        //simpleTime = new SimpleTime(23, 60);

        System.out.println(simpleTime);
    }

    @Test
    void testGetTimeString() {
        simpleTime = new SimpleTime("22:44");

        System.out.println(simpleTime.getHours());
    }

    @Test
    void testInvalidTimeHour() {
       InvalideTimeException ex = assertThrows(InvalideTimeException.class, () -> new SimpleTime(24, 22));
       assertEquals("Hour is invalid (0-23)", ex.getMessage());
    }

    @Test
    void testInvalidTimeMinute() {
        InvalideTimeException ex = assertThrows(InvalideTimeException.class, () -> new SimpleTime(22, 60));
        assertEquals("Minute is invalid (0-59)", ex.getMessage());
    }

    @Test
    void testInvalidTimeStringNull() {
        InvalideTimeException ex = assertThrows(InvalideTimeException.class, () -> new SimpleTime(null));
        assertEquals("Time cant null!", ex.getMessage());
    }



}