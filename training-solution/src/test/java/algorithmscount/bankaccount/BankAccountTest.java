package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    BankAccountConditionCounter bac;

    @Test
    void testAccountNumber () {
        List<BankAccount> accountList = Arrays.asList(new BankAccount(100_000), new BankAccount(200_000),
                    new BankAccount(250_000));
        bac = new BankAccountConditionCounter();
        int actual = bac.numberAccount(accountList, 90_000);
        assertEquals(3, actual);
    }
}
