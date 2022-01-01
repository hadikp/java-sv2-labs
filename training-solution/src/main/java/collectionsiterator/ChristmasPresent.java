package collectionsiterator;

public class ChristmasPresent {

    private int price;
    private String name;

    public ChristmasPresent(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" + "price=" + price + ", name=" + name + "}";
    }
}
