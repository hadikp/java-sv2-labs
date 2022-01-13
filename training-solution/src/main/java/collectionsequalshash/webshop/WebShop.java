package collectionsequalshash.webshop;

import java.util.ArrayList;
import java.util.List;

public class WebShop {

    List<Product> products = new ArrayList<>();

    public WebShop(List<Product> products) {
        this.products = products;
    }

    public int findHowMany(Product product) {
        int counter = 0;
        for (Product p: products) {
            if (p.equals(product)) {
                counter++;
            }
        }
        return counter;
    }
}
