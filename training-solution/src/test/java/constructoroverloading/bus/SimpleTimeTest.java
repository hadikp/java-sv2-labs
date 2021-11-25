package constructoroverloading.bus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTimeTest {

    @Test
    void testConstructor() {
        SimpleTime firstStart = new SimpleTime(8);
        SimpleTime minutes = new SimpleTime(8, 30);
        SimpleTime lastStart = new SimpleTime(22);
        assertEquals(840, lastStart.getDifference(firstStart));
        System.out.println(lastStart.toString());
    }

}