package algorithmscount.transaction;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionCounterTest {

    TransactionCounter tc;

    @Test
    void testTransaction () {
        tc = new TransactionCounter();
        List<Transaction> transactionList = Arrays.asList(new Transaction(TransactionType.CREDIT, 60_000),
                new Transaction(TransactionType.DEBIT, 50_000),
                new Transaction(TransactionType.CREDIT, 90_000),
                new Transaction(TransactionType.CREDIT, 100_000));
        int counter = tc.accountNumber(transactionList, 90_000);
        assertEquals(1, counter);
    }
}
