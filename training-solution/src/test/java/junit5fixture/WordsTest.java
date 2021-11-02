package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsTest {

    Words word;


    @BeforeEach
    void init() {
        word = new Words();
        word.addWord("alma");
        word.addWord("ablak");
        word.addWord("körte");
        word.addWord("koporsó");
        word.addWord("komor");
    }

    @Test
    void testGetWordsStartWith() {
        List<String> getWordsStartWithSolution = Arrays.asList("koporsó", "komor");
        word.getWordsStartWith("ko");
        assertEquals(getWordsStartWithSolution, word.getWords());
    }

    @Test
    void testGetWordsWithLength() {
        List<String> getWordsWithLenghtSolution = Arrays.asList("ablak", "körte", "komor");
        word.getWordsWithLength(5);
        assertEquals(getWordsWithLenghtSolution, word.getWords());
    }
}
