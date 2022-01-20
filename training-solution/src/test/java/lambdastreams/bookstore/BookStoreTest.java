package lambdastreams.bookstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BookStoreTest {

    BookStore bookStore;

    @BeforeEach
    void init() {
        bookStore = new BookStore(Arrays.asList(new Book("Alien", 1971, 2100, 100),
                new Book("Robots", 1985, 3100, 200),
                new Book("Nyolcadik utas a halál", 1979, 1100, 50),
                new Book("Alapítvány", 1988, 1500, 33)));
    }

    @Test
    void testGetNumberOfBooks() {
        assertEquals(4, bookStore.getNumberOfBooks());
    }

    @Test
    void testFindNewestBook() {
        System.out.println(bookStore.findNewestBook());
    }

    @Test
    void  testGetTotalValue() {
        assertEquals(7800, bookStore.getTotalValue());
    }

}