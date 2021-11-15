package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BooksTest {


    @TempDir
    File temporaryFolder;

    @Test
    void testReadBooks () {
        Path path = Paths.get("src/test/resources/book.txt");
        String readBooksExpected = "G 25;Egri csillagok;Gárdonyi Géza";
        List<String> readBooksActual = new Books().booksRead(path);
        assertEquals(readBooksExpected, readBooksActual.get(0));
    }

    @Test
    void testWriteBooks () throws IOException {
        Path pathWrite = temporaryFolder.toPath().resolve("bookFine.txt");
        Path pathRead =Paths.get("src/test/resources/book.txt");

        List<String> booksListFromFile = new Books().booksRead(pathRead);
        List<String> bookListFine = new Books().betterList(booksListFromFile);
        new Books().writeFile(pathWrite, bookListFine);
        String booksExpected = "Gárdonyi Géza : Egri csillagok";
        List<String> load = Files.readAllLines(pathWrite);
        assertEquals(booksExpected, load.get(0));
    }
}
