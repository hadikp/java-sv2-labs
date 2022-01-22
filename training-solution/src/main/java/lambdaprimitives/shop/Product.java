package lambdaprimitives.shop;

public class Product {

    private String name;
    private int price;
    private int db;

    public Product(String name, int price, int db) {
        this.name = name;
        this.price = price;
        this.db = db;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getDb() {
        return db;
    }
}
