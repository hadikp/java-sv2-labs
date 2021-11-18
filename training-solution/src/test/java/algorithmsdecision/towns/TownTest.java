package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {

    @Test
    void testTornLimit () {
        Town town = new Town();
        List<Integer> townList = Arrays.asList(111, 2233, 544, 766, 222);
        assertTrue(town.containsFewerHabitants(townList, 2000));
        assertTrue(town.containsFewerHabitants(townList, 500));
        assertFalse(town.containsFewerHabitants(townList, 110));
    }



}