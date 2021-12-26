package exceptionresource.hiddenword;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class HiddenWordTest {

    HiddenWord hiddenWord;

    @Test
    void testReadFile() {
        Path path = Paths.get("src/test/resources/hiddenword.txt");
        hiddenWord = new HiddenWord();
        System.out.println(hiddenWord.getHiddenWord(path));


    }

}