package methodoverloading;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {

    ClassFiveA cfa;

    @BeforeEach
    void init () {
        cfa = new ClassFiveA(Arrays.asList("Péter", "János", "Emese", "Enikő", "Albert"));
    }

    @Test
    void testIntNumber () {
        assertEquals("Péter", cfa.getTodayReferringStudent(1));
        assertEquals("Emese", cfa.getTodayReferringStudent(3));
     }

     @Test
    void testEnum () {
        assertEquals("Albert", cfa.getTodayReferringStudent(Number.FIVE));
        assertEquals("János", cfa.getTodayReferringStudent(Number.TWO));
     }

    @Test
    void testStringNumber () {
        assertEquals("Albert", cfa.getTodayReferringStudent("five"));
        assertEquals("Péter", cfa.getTodayReferringStudent("one"));

    }

}