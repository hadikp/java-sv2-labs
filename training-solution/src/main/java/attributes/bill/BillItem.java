package attributes.bill;

public class BillItem {
    private String product; //neve
    private int price;
    private int quantity;
    private double vatPercent; //ÁFA

    public BillItem(String product, int price, int quantity, double vatPercent) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.vatPercent = vatPercent;
    }

    public double calculateTotalPrice() {
        return price * quantity * (1 + vatPercent);
    }

    public String getProduct() {
        return product;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getVatPercent() {
        return vatPercent;
    }
}
