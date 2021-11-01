package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {

    @Test
    void testName() {
        Dragon dragon = new Dragon("Süsü", 7, 11.5);
        assertEquals("Süsü", dragon.getName());
        assertNotEquals("Jancsi", dragon.getName());
    }

    @Test
    void testNumberOfHeads() {
        Dragon dragon = new Dragon("Süsü", 7, 11.5);
        assertEquals(7, dragon.getNumberOfHeads());
        assertTrue(dragon.getNumberOfHeads() == 7);
        assertFalse(dragon.getNumberOfHeads() == 8);
    }

    @Test
    void testHeight() {
        Dragon dragon = new Dragon("Süsü", 7, 11.5);
        assertEquals(11.5, dragon.getHeight(), 0.005);
    }

    @Test
    void testNull() {
        Dragon dragon = new Dragon("Süsü", 7, 11.5);
        Dragon dragon2 = new Dragon(null, 7, 11.5);
        assertNull(dragon2.getName());
        assertNotNull(dragon.getName());
    }

    @Test
    void testSameObjects() {
        Dragon dragon = new Dragon("Süsü", 7, 11.5);
        Dragon dragon2 = new Dragon(null, 7, 11.5);
        dragon2 = dragon;
        assertSame(dragon, dragon2);
    }

    @Test
    void testNotSameObjects() {
        Dragon dragon = new Dragon("Süsü", 7, 11.5);
        Dragon dragon2 = new Dragon(null, 7, 11.5);
        assertNotSame(dragon, dragon2);
    }

}
