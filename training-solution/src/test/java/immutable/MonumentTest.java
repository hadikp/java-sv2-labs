package immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonumentTest {

    Monument monument;

    @Test
    void testMonumentAddData () {
        monument = new Monument("Petőfi szobor", "Székesfehérvár", "2010", "1122");
        assertEquals("Petőfi szobor", monument.getName());
    }

    @Test
    void testNullAllData () {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> new Monument(null, null, null, null));
        assertEquals("A nevet és a többi adatot is meg kell adnod!", ex.getMessage());
    }

    @Test
    void testNullData () {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> new Monument("Petőfi Szobor", null, null, null));
        assertEquals("A nevet és a többi adatot is meg kell adnod!", ex.getMessage());
    }

}