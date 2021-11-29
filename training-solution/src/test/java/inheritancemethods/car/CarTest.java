package inheritancemethods.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;

    @BeforeEach
    void init() {
        car = new Car(5, 40, 45);
    }


    @Test
    void testDriveFuelNull() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> car.drive(800));
        assertEquals("Ennyi km-t nem tudsz menni, mert elfogy a benzin!", iae.getMessage());
        System.out.println(car.getFuel());
        System.out.println(car.calculateRefillAmount());
    }

    @Test
    void testIsPossibleKm() {
        assertTrue(car.isPossibleKm(800));
        assertFalse(car.isPossibleKm(801));
    }

}