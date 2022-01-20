package lambdastreams.bookstore;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class BookStore {

    private List<Book> books;

    public BookStore(List<Book> books) {
        this.books = books;
    }

    public Long getNumberOfBooks() {
        return books.stream().count();
    }

    public Optional<Book> findNewestBook() {
        Optional result = books.stream().sorted(Comparator.comparing(Book::getYear).reversed()).findFirst();
        return result;
    }

    public Integer getTotalValue() {
        return books.stream().mapToInt(Book::getPrice).reduce(0, Integer::sum);
    }
}
