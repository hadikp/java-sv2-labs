package interfaces.figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testArea() {
        Rectangle rectangle = new Rectangle(3.5, 2);
        assertEquals(7, rectangle.getArea());
    }

}