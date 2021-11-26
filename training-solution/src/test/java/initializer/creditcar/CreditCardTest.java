package initializer.creditcar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    @Test
    void testPayment() {
        CreditCard cd = new CreditCard(1_000_000);
        assertEquals(542_385, cd.payment(1251, Currency.EUR));
        System.out.println();


    }

}