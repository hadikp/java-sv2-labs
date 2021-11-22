package methodpass.troopers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    void testdistanceFrom () {
        Position pos1 = new Position(10, 11);
        Position pos2 = new Position(5, 6);
        assertEquals(7.071, pos1.distanceFrom(pos2), 0.005);


    }

}