package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {
    private Ship ship;

    @BeforeEach
    void init() {
        ship = new Ship("Hajó", 1999, 122.3);
    }

    @Test
    void testName() {
        assertEquals("Hajó", ship.getName());
        assertNotEquals("H", ship.getName());
    }

    @Test
    void testYearOfConstruction() {
        assertEquals(1999, ship.getYearOfConstruction());
        assertTrue(ship.getYearOfConstruction() == 1999);
        assertFalse(ship.getYearOfConstruction() == 1997);
    }

    @Test
    void testLength() {
        assertEquals(122.3, ship.getLength(), 0.005);
    }

    @Test
    void testNull() {
        Ship ship2 = new Ship(null, 1977, 22.4);
        assertNull(ship2.getName());
        assertNotNull(ship.getName());
    }

    @Test
    void testSameObjects() {
        Ship ship3 = new Ship(null, 1977, 22.4);
        ship3 = ship;
        assertSame(ship, ship3);
    }

    @Test
    void testNotSameObjects() {
        Ship ship4 = new Ship("Hajó", 1977, 22.4);
        assertNotSame(ship, ship4);
    }

}
