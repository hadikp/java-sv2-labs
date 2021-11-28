package inheritanceattributes.book;

public class ShippingCost extends Book {

    private int shippingCost;

    public ShippingCost(String title, int price, int shippingCost) {
        super(title, price);
        this.shippingCost = shippingCost;
    }

    public int order(int pieces) {
        return purchase(pieces) + shippingCost;
    }

    @Override
    public String toString() {
        return getTitle() + ": " + order(1) + " Ft, postaköltség: " + shippingCost + " Ft";
    }
}
