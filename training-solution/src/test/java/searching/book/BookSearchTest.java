package searching.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookSearchTest {

    Path path;
    List<Book> books = new ArrayList<>();


    @BeforeEach
    void init() {
        path = Path.of("src/test/resources/books.csv");
        try {
            List<String> fileBooks = Files.readAllLines(path);
            for (String st: fileBooks) {
                String[] stSplit = st.split(";");
                books.add(new Book(Integer.parseInt(stSplit[0]), stSplit[2], stSplit[1]));
            }
        }
        catch (IOException ioe) {
            throw new IllegalArgumentException("Can't read file!", ioe);
        }
    }


    @Test
    void testReadFile() {
        Collections.sort(books);
        for (Book b: books) {
            System.out.println(b);
        }
    }

    @Test
    void testBookFind() {
        BookSearch bookSearch = new BookSearch(books);
        System.out.println(bookSearch.findBookByAuthorTitle("Tolkien", "A babó"));
    }

}