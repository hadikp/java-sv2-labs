package collectionsmap.casting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CastingTest {

    Casting casting;
    Map<Integer, String> applicants;

    @BeforeEach
    void init() {
        casting = new Casting();
        applicants = new HashMap<>();
        applicants.put(77, "Nagy Endre");
        applicants.put(105, "Hadik Péter");
        applicants.put(19, "Kis János");
        applicants.put(45, "John Doe");
        applicants.put(82, "Mekk Elek");
    }

    @Test
    void testcallNextApplicant() {
        assertEquals("Hadik Péter", casting.callNextApplicant(99, applicants));
        assertEquals("Kis János", casting.callNextApplicant(11, applicants));
        assertEquals("John Doe", casting.callNextApplicant(48, applicants));
    }

}