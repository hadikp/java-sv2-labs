package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLetterTest {

    @Test
    void testLetters () {
        TwoLetter letter = new TwoLetter();
        List<String> words = Arrays.asList("Kép", "Kefe", "Lista", "András");
        List<String> expected = Arrays.asList("Ké", "Ke", "Li", "An");
        assertEquals(expected, letter.getFirstTwoLetters(words));
        System.out.println(letter.getFirstTwoLetters(words));
    }

}