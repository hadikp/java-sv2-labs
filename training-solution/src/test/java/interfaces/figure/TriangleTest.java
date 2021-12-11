package interfaces.figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void testArea() {
        Triangle triangle = new Triangle(2.5, 2.3);
        assertEquals(2.875, triangle.getArea(), 0.005);

    }

}