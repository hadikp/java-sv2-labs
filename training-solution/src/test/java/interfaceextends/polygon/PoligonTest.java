package interfaceextends.polygon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoligonTest {

    @Test
    void testPoligon() {
        Poligon triangle = new Poligon(2, 3);
        assertEquals(3, triangle.getNumberOfVertices());
        assertEquals(2, triangle.getLengthOfSide());
        assertEquals(6, triangle.getPerimeter());
        assertEquals(0, triangle.getNumberOfDiagonalsFromOneVertex());
        assertEquals(0, triangle.getNumberOfAllDiagonals());

        Poligon hexagon = new Poligon(2, 6);
        System.out.println(hexagon.getNumberOfVertices());
        System.out.println(hexagon.getLengthOfSide());
        System.out.println(hexagon.getPerimeter());
        System.out.println(hexagon.getNumberOfDiagonalsFromOneVertex());
        System.out.println(hexagon.getNumberOfAllDiagonals());
    }

}