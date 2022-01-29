package streems.book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Read {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<String> listBookTitlesShorterThanGiven(int maxNumberOfPages) {
        return books.stream().filter(f -> f.getPageNumbers() < maxNumberOfPages).map(Book::getTitle).toList();
    }

    public List<String> listBookTitlesWithGivenAuthor(String author) {
        return books.stream().filter(f -> f.getAuthor().equals(author)).sorted(Comparator.comparing(Book::getTitle))
                .map(p -> p.getTitle()).toList();
    }

    public List<String> listAuthors() {
        return books.stream().map(Book::getAuthor).distinct().toList();
    }
}
