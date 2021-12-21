package enumabstract.orders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderStateTest {

    @Test
    void testEnum() {
        Deletable deletableNew = OrderState.NEW;
        Deletable deletableConf = OrderState.CONFIRMED;
        Deletable deletablePrep = OrderState.PREPARED;
        Deletable deletable = OrderState.DELETED;

        assertTrue(deletableNew.canDelete());
        assertTrue(deletableConf.canDelete());
        assertTrue(deletablePrep.canDelete());
        assertFalse(deletable.canDelete());
    }

}