package genericsusage.withgenerics;

import genericsusage.Book;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Library library = new Library();

    @Test
    void testBookListNull() {
        NullPointerException npe = assertThrows(NullPointerException.class, () -> library.getFirstBook(null));
        assertEquals("A lista nem lehet null!", npe.getMessage());
    }

    @Test
    void testBookListEmpty() {
        List<Book> books = new ArrayList<>();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> library.getFirstBook(books));
        assertEquals("A lista nem lehet üres!", iae.getMessage());
    }

}