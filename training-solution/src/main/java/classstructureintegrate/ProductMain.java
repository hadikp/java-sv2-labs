package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Product name?");
        String name = scanner.nextLine();
        System.out.println("Product price?");
        int price = scanner.nextInt();
        Product prod = new Product(name, price);
        System.out.println("The price: " + prod.getPrice());
        prod.increasePrice(10);
        System.out.println("The price is increasing, the price now: " + prod.getPrice());

        prod.decreasePrice(10);
        System.out.println("The price is decreasing, the price now: " + prod.getPrice());
    }
}
