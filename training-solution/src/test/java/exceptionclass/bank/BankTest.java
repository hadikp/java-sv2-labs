package exceptionclass.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    Account acc1;
    Account acc2;
    Account acc3;
    Bank bank;

    @BeforeEach
    void init() {
        acc1 = new Account("111-111", 300_000);
        acc2 = new Account("111-222", 400_000);
        acc3 = new Account("111-333", 550_000);
        List<Account> accounts = List.of(acc1, acc2, acc3);
        bank = new Bank(accounts);
    }

    @Test
    void testInit() {
        assertEquals(3, bank.getAccounts().size());
        assertEquals(550_000, bank.getAccounts().get(2).getBalance());
    }

    @Test
    void testAccountListNull() {
        List<Account> accountsNull = null;
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> new Bank(accountsNull));
        assertEquals("Account lista nem lehet üres!", ex.getMessage());
    }

    @Test
    void testBalanceRise() {
        bank.balanceRise("111-111", 50_000);
        assertEquals(350_000, bank.getAccounts().get(0).getBalance());
    }

    @Test
    void testBalanceDrop() {
        bank.balanceDrop("111-111", 50_000);
        assertEquals(250_000, bank.getAccounts().get(0).getBalance());
    }

    @Test
    void testInvalidAccountNumber() {
        InvalidAccountNumberBankOperationException ex = assertThrows(InvalidAccountNumberBankOperationException.class,
                () -> bank.balanceRise("11", 30000));
        assertEquals("Nincs ilyen számlaszám", ex.getMessage());
    }

    @Test
    void testInvalidBalanceDrop() {
        LowBalanceBankOperationException ex = assertThrows(LowBalanceBankOperationException.class,
                () -> bank.balanceDrop("111-111", 500_000));
        assertEquals("Nincs elég pénz a számládon!", ex.getMessage());
    }



}