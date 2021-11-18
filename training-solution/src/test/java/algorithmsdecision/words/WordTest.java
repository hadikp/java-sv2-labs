package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void testWordLength () {
        Word word = new Word();
        List<String> wordsList = Arrays.asList("Kicsi", "Nagy", "Piroska", "Bárna");
        assertTrue(word.containsLongerWord(wordsList, "Kis"));
        assertTrue(word.containsLongerWord(wordsList, "Kép"));
        assertFalse(word.containsLongerWord(wordsList, "Kicsikécske"));
        assertFalse(word.containsLongerWord(wordsList, "Kicsitnagy"));
    }

}