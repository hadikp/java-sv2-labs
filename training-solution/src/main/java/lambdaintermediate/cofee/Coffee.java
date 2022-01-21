package lambdaintermediate.cofee;

public class Coffee {

    private CoffeeType coffeeType;
    private int price;

    public Coffee(CoffeeType coffeeType, int price) {
        this.coffeeType = coffeeType;
        this.price = price;
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return coffeeType + ", " + price;
    }
}
