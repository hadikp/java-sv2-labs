package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {

    Hill hill;

    @Test
    void testMaxHill () {
        hill = new Hill();
        List<Integer> higherHillList = Arrays.asList(111, 222, 234, 555, 12, 123);
        assertEquals(555, hill.getMax(higherHillList));
    }

}