package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableClothTest {

    @Test
    void testSquareMethods() {
        Square table = new TableCloth(3.5);
        assertEquals(3.5, table.getSide());
        assertEquals(4, table.getNumberOfSides());
        assertEquals(14, table.getPerimeter());
        assertEquals(4.95, table.getLengthOfDiagonal(), 0.005);

    }

}