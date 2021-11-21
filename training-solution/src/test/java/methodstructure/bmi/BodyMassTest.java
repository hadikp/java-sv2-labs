package methodstructure.bmi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassTest {

    BodyMass bmi;

    @BeforeEach
    void init () {
        bmi = new BodyMass(60, 1.7);
    }

    @Test
    void testBMIIndex () {
        assertEquals(20.76, bmi.getBodyMassIndex(), 0.005);
    }

    @Test
    void testgetBody () {
        assertEquals(BmiCategory.NORMAL, bmi.getBody());
    }

    @Test
    void testisThinnerThan () {
        BodyMass bmiBigger = new BodyMass(88, 1.7);
        BodyMass bmiSmaller = new BodyMass(50, 1.7);
        boolean resultBigger = bmi.isThinnerThan(bmiBigger);
        boolean resultSmaller = bmi.isThinnerThan(bmiSmaller);
        assertTrue(resultBigger);
        assertFalse(resultSmaller);
    }

}