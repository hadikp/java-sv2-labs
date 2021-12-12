package interfacerules;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IkeaFurnitureTest {

    @Test
    void testIkea() {
        IkeaFurniture ikf = new IkeaFurniture("szekrény", 1.8, 1.2);
        assertEquals(1.8, ikf.getLength(), 0.005);
        assertEquals(1.2, ikf.getWidth(), 0.005);
        assertEquals("szekrény", ikf.getName());
    }

}