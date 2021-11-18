package algorithmsdecision.bankaccount;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountDecisionMakerTest {

    @Test
    void testBankAccounts () {
        BankAccountDecisionMaker bank = new BankAccountDecisionMaker();
        List<BankAccount> accounts = Arrays.asList(new BankAccount("Péter", 1_000_500),
                new BankAccount("János", 500_500),
                new BankAccount("Rózsa", 1_000_500),
                new BankAccount("Kristóf", 100_500));

        assertTrue(bank.containsBalanceGreaterThan(accounts, 100_000));
        assertTrue(bank.containsBalanceGreaterThan(accounts, 100_500));
        assertFalse(bank.containsBalanceGreaterThan(accounts, 10_100_500));
        assertFalse(bank.containsBalanceGreaterThan(accounts, 1_100_500));
    }
}