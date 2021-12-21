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

        assertEquals(true, deletableNew.canDelete());
        assertEquals(true, deletableConf.canDelete());
        assertEquals(true, deletablePrep.canDelete());
        assertEquals(false, deletable.canDelete());
    }

}