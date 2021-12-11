package interfaces.figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testArea() {
        Circle circle = new Circle(3);
        assertEquals(28.2743, circle.getArea(), 0.005);
    }

}