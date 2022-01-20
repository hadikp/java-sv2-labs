package lambdastreams.bookstore;

public class Book {

    private String title;
    private int year;
    private int price;
    private int db;

    public Book(String title, int year, int price, int db) {
        this.title = title;
        this.year = year;
        this.price = price;
        this.db = db;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public int getDb() {
        return db;
    }

    @Override
    public String toString() {
        return title +", " + year + ", " + price +"," + db;
    }
}
