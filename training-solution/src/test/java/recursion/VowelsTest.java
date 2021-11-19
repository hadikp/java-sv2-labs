package recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {

    Vowels v;

    @BeforeEach
    void init () {
        v = new Vowels();
        int counter = 0;

    }

    @Test
    void testVowels () {
       // assertEquals(2, v.getNumberOfVowels("abba"));
       // assertEquals(2, v.getNumberOfVowels("babák"));
       // assertEquals(3, v.getNumberOfVowels("babagörl"));
        assertEquals(2, v.getNumberOfVowels("iszik"));

    }

}