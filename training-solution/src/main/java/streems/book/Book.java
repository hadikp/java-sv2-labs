package streems.book;

public class Book {

    private String author;
    private String title;
    private int pageNumbers;

    public Book(String author, String title, int pageNumbers) {
        this.author = author;
        this.title = title;
        this.pageNumbers = pageNumbers;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }
}
