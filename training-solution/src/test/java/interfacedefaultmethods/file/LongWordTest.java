package interfacedefaultmethods.file;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class LongWordTest {

    @Test
    void testReadFile() {
        Path path = Path.of("src/test/resources/longword.txt");
        LongWord longWord = new LongWord();
        System.out.println(longWord.getLongWord(path));

    }

}