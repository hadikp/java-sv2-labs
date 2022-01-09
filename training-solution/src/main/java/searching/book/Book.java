package searching.book;

import java.util.Objects;

public class Book implements Comparable<Book> {

    private int id;
    private String title;
    private String author;

    public Book(String author, String title) {
        this.title = title;
        this.author = author;
    }

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public int compareTo(Book other) {
        if (author.compareTo(other.author) == 0) {
            return title.compareTo(other.title);
        } else {
            return author.compareTo(other.author);
        }
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return id + " " + author + ": " + title;
    }
}
