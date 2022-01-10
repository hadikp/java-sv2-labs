package sorting.webshop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WebShopTest {

    Product szappan;
    Product banan;
    Product ivole;
    Product alma;
    WebShop webShop;

    @BeforeEach
    void init() {
        szappan = new Product("szappan", 1000, LocalDateTime.of(2021, 11, 11, 7, 11));
        banan = new Product("banán", 2000, LocalDateTime.of(2022, 1, 11, 8, 30));
        ivole = new Product("ivólé", 300, LocalDateTime.of(2022, 1, 5, 11, 11));
        alma = new Product("alma", 350, LocalDateTime.of(2021, 12, 5, 11, 11));
        webShop = new WebShop(Arrays.asList(szappan, banan, ivole, alma));
    }

    @Test
    void testOrder() {
        System.out.println(webShop.addProductByDateTime());
        System.out.println(webShop.getProducts());
    }

}