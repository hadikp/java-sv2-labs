package methodchain;

import finalmodifier.Week;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedWordTest {

    ModifiedWord word;

    @Test
    void testModify () {
        word = new ModifiedWord();
        word.modify("szilva");
    }

}