package collectionsequalshash.webshop;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WebShopTest {

    @Test
    void testCount() {
        Product tej = new Product("tej", "1111");
        Product tojas = new Product("tojás", "1111");
        Product sajt = new Product("sajt", "1111");
        Product mez = new Product("méz", "2222");
        List<Product> products = Arrays.asList(tej, tojas, sajt, mez);
        WebShop webShop = new WebShop(products);
        assertEquals(3, webShop.findHowMany(new Product("lekvár", "1111")));
    }

}