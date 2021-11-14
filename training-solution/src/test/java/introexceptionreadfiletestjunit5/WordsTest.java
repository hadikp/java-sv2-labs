package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WordsTest {

    private Words word;

    @BeforeEach
    void init() {
        word = new Words();
    }
    @Test
    void testWordGoog() {
        String w = word.getFirstWordWithA(Paths.get("src/test/resources/words.txt"));
        assertEquals("Anna", w);
    }

    @Test
    void testWordFalse() {
        IllegalStateException exception = assertThrows(IllegalStateException.class, () ->
                word.getFirstWordWithA(Paths.get("src/test/resources/words.txt-")));
        assertEquals("Cannot read file!", exception.getMessage());
    }

    @Test
    void testWorReturnA() {
        String w = word.getFirstWordWithA(Paths.get("src/test/resources/wordsWithoutA.txt"));
        assertEquals("A", w);
    }

}
