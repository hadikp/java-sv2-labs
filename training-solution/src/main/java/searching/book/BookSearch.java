package searching.book;

import java.util.Collections;
import java.util.List;

public class BookSearch {

    private List<Book> books;

    public BookSearch(List<Book> books) {
        this.books = books;
    }

    public Book findBookByAuthorTitle(String author, String title) {
        Collections.sort(books);
        isInputStringEmpty(author);
        isInputStringEmpty(title);
        Book key = new Book(author, title);
        int index = Collections.binarySearch(books, key);
        if (index < 0) {
            throw new IllegalArgumentException("Nem találtam ilyen könyvet!");
        }
        return books.get(index);
    }

    private void isInputStringEmpty(String author) {
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Search string is not be empty!");
        }
    }

    public List<Book> getBooks() {
        return books;
    }
}
