package introexceptionthrowjunit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TankTest {
    Tank tank;

    @BeforeEach
    void init() {
        tank = new Tank();
        tank.modifyAngle(30);
    }

    @Test
    void getAngle() {
        int actual = 30;
        assertEquals(actual, tank.getAngle());
    }

    @Test
    void testAngleGood() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> tank.modifyAngle(90));
        assertEquals("Nem jó a szám amit megadtál! Ennyit nem fordul az ágyú.", exception.getMessage());
    }
}
