package lambda.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountsTest {

    BankAccount peter;
    BankAccount janos;
    BankAccount eniko;
    BankAccount bali;
    BankAccount peter2;
    BankAccount andi;
    BankAccounts bankAccounts;

    @BeforeEach
    void init() {
        peter = new BankAccount("1111111", "Péter", 2_000_000);
        peter2 = new BankAccount("1112222", "Péter", 1_000_000);
        janos = new BankAccount("2222222", "János", 1_000_000);
        eniko = new BankAccount("1115222", "Enikő", 3_000_000);
        bali = new BankAccount("333333", "Balázs", -3_000_000);
        andi = new BankAccount("444444", null, 500_000);
        bankAccounts = new BankAccounts(Arrays.asList(peter, janos, eniko, bali, peter2, andi));
    }

    @Test
    void testOrderingByBankAccount() {
        assertEquals(peter, bankAccounts.orderingByBankAccount().get(0));
        assertEquals(janos, bankAccounts.orderingByBankAccount().get(2));
    }

    @Test
    void testOrderingByBalance() {
        assertEquals(eniko, bankAccounts.orderingByBalance().get(0));
    }

    @Test
    void testOrderingByNameAndBankAccount() {
        System.out.println(bankAccounts.orderingByNameAndBankAccount());
    }



}