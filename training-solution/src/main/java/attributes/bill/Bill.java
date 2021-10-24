package attributes.bill;

public class Bill {
    public static void main(String[] args) {
        BillItem item = new BillItem("Nike cipő", 12000, 10, 0.27);

        System.out.println("A termék neve: " + item.getProduct());
        System.out.println("A termék egységára: " + item.getPrice());
        System.out.println("Az eladott mennyiség: " + item.getQuantity());
        System.out.println("A számla teljes összege: " + item.calculateTotalPrice());
    }
}
