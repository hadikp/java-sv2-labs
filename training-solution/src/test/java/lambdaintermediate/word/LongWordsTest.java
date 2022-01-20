package lambdaintermediate.word;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LongWordsTest {

    LongWords longWords;

    @BeforeEach
    void init() {
        longWords = new LongWords(Arrays.asList("al", "alma", "alomka", "kép", "kér", "kém"));
    }

    @Test
    void testGetNumberOfWordsStartWith() {
        assertEquals(3, longWords.getNumberOfWordsStartWith("al"));
        assertEquals(3, longWords.getNumberOfWordsStartWith("ké"));
    }

    @Test
    void testGetLongerWords() {
        assertEquals(Arrays.asList("alma", "alomka"), longWords.getLongerWords(3));
    }

    @Test
    void testGetShortestWord() {
        System.out.println(longWords.getShortestWordContainingGivenCharacter('a'));
    }

}