package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {

    @Test
    void testListWord () {
        Prefix pre = new Prefix();
        List<String> words = Arrays.asList("Katica", "Katinka", "Balázs", "Bakó", "Kárókatona");
        assertEquals(2, pre.getWordsStartWith(words, "Ba").size());
        System.out.println(pre.getWordsStartWith(words, "Ba"));

        assertEquals(Arrays.asList("Kárókatona"), pre.getWordsStartWith(words, "Kár"));
        assertNotEquals(Arrays.asList("Kárókatona"), pre.getWordsStartWith(words, "Ba"));
    }

}