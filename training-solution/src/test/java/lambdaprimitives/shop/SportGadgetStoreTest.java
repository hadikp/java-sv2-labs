package lambdaprimitives.shop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SportGadgetStoreTest {

    SportGadgetStore sportGadgetStore;

    @BeforeEach
    void init() {
        Product zokni = new Product("zokni", 200, 10);
        Product uto = new Product("teniszütő", 10_300, 15);
        Product zsemle = new Product("zsemle", 20, 20);
        Product cipo = new Product("cipo", 4200, 5);
        sportGadgetStore = new SportGadgetStore(Arrays.asList(zokni, uto, zsemle, cipo));
    }

    @Test
    void testGetNumberOfProducts() {
        assertEquals(4, sportGadgetStore.getNumberOfProducts());
    }

    @Test
    void testGetAveragePrice() {
        assertEquals(3680, sportGadgetStore.getAveragePrice());
    }

    @Test
    void testGetExpensiveProductStatistics() {
        assertEquals("Nincs ilyen termék", sportGadgetStore.getExpensiveProductStatistics(110000));
        System.out.println(sportGadgetStore.getExpensiveProductStatistics(100));

    }

}