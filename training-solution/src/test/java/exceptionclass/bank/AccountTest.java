package exceptionclass.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account acc = new Account("11112-33333-44444", 250_000);

    @Test
    void testBalancePlus() {
        acc.deposit(20_000);
        assertEquals(270_000, acc.getBalance());
    }

    @Test
    void testAccountNull() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> new Account(null, 210_000));
        assertEquals("A számlaszám nem lehet üres!", ex.getMessage());
    }

    @Test
    void testSubstarct() {
        InvalidAmountBankOperationException ex = assertThrows(InvalidAmountBankOperationException.class,
                () -> acc.subtract(200_000));
        assertEquals("Nagyobb összeget adtál meg a max levonhatónál!", ex.getMessage());
    }

    @Test
    void testSubstractNull() {
        InvalidAmountBankOperationException ex = assertThrows(InvalidAmountBankOperationException.class,
                () -> acc.subtract(0));
        assertEquals("A megadott összeg nem lehet nulla!", ex.getMessage());
    }

    @Test
    void testDepositNull() {
        InvalidAmountBankOperationException ex = assertThrows(InvalidAmountBankOperationException.class,
                () -> acc.deposit(0));
        assertEquals("A megadott összeg nem lehet nulla!", ex.getMessage());
    }

}