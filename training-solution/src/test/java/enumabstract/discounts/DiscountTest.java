package enumabstract.discounts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {

    @Test
    void testOffer() {
        AmountToPay atp = Discount.SPECIAL_OFFER;
        assertEquals(800, atp.getAmountToPay(1000, 1));
        assertEquals(800, Discount.SPECIAL_OFFER.getAmountToPay(1000, 1));
    }

    @Test
    void testBlackFriday() {
        AmountToPay atp = Discount.BLACK_FRIDAY_OFFER;
        assertEquals(150, atp.getAmountToPay(100, 2));
        assertEquals(200, atp.getAmountToPay(100, 3));
        assertEquals(350, atp.getAmountToPay(100, 5));

    }

}