package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void testDistance() {
        Point p = new Point(2, 3);
        System.out.println(p.distance(3, 4));
    }

}