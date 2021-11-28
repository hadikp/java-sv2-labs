package inheritanceattributes.book;

public class Book {

    private String title;
    private int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public int purchase(int pieces) {
        return price * pieces;
    }

    public String getTitle() {
        return title;
    }
}
