package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    Temperature temp;

    @Test
    void testTemperature () {
        temp = new Temperature();
        List<Integer> temperatureList = Arrays.asList(11, 2, 33, 44, 11, 22, 33);
        assertEquals(2, temp.getMin(temperatureList));
    }

}