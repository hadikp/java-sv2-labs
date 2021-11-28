package inheritanceattributes.book;

import org.junit.jupiter.api.Test;

class shippingCostTest {

    Book book;
    ShippingCost shippingCost;

    @Test
    void testToString() {
        shippingCost = new ShippingCost("Gyűrűk ura", 1800, 1200);
        System.out.println(shippingCost);
    }

}