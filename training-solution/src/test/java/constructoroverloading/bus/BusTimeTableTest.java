package constructoroverloading.bus;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BusTimeTableTest {

    SimpleTime firstStart;
    SimpleTime actual1;
    SimpleTime actual2;
    SimpleTime minutes;
    SimpleTime lastStart;
    BusTimeTable busTable;

    @BeforeEach
    void init() {
         firstStart = new SimpleTime(8);
         actual1 = new SimpleTime(8, 10);
         actual2 = new SimpleTime(8, 40);
         minutes  = new SimpleTime(8, 30);
         lastStart = new SimpleTime(22);
         busTable = new BusTimeTable(8, 11, 30);
    }

    @Test
    void testBusTimeTable() {
        assertEquals(6, busTable.getTimeTable().size());
        assertEquals(6, busTable.getTimeTable().size());
        assertEquals(8, busTable.getTimeTable().get(0).getHours());
    }

    @Test
    void testGetNextBus() {
        SimpleTime expect1 = new SimpleTime(8, 30);
        SimpleTime expect2 = new SimpleTime(9, 00);
        assertEquals(expect1.toString(), busTable.getNextBus(actual1).toString());
        assertEquals(expect2.toString(), busTable.getNextBus(actual2).toString());
    }

}