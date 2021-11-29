package inheritancemethods.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JeepTest {

    Jeep jeep;

    @BeforeEach
    void init() {
        jeep = new Jeep(5, 40, 45, 10, 15);
    }

    @Test
    void testDrive() {
        jeep.drive(999);
        assertEquals(0.05, jeep.getFuel(), 0.005);
        System.out.println(jeep.calculateRefillAmount());
    }

}