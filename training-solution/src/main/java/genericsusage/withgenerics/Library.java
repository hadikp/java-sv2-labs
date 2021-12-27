package genericsusage.withgenerics;

import genericsusage.Book;

import java.util.List;

public class Library {

    public Book getFirstBook(List<Book> books) {
        if (books == null) {
            throw new NullPointerException("A lista nem lehet null!");
        }
        if (books.size() == 0) {
            throw new IllegalArgumentException("A lista nem lehet üres!");
        }
        return books.get(0);
    }
}
