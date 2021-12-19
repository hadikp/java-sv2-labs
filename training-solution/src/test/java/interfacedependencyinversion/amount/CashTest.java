package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashTest {

    @Test
    void testAmount() {
        Payable payable = new Amount();
        assertEquals(1352, payable.getPayableAmount(1352));
    }

    @Test
    void testPayable() {
        Payable payable = new Cash();
        assertEquals(1000, payable.getPayableAmount(1001));
        assertEquals(1000, payable.getPayableAmount(1002));
        assertEquals(1005, payable.getPayableAmount(1003));
        assertEquals(1005, payable.getPayableAmount(1004));
        assertEquals(1005, payable.getPayableAmount(1005));
        assertEquals(1010, payable.getPayableAmount(1009));
    }

}