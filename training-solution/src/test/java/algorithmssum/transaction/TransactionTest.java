package algorithmssum.transaction;

import org.junit.jupiter.api.BeforeEach;

public class TransactionTest {

    @BeforeEach
    void init() {
        Transaction transaction1 = new Transaction("10110001-14811230-00000007", TransactionOperation.CREDIT, 120_000);
        Transaction transaction2 = new Transaction("10110001-14811230-00000008", TransactionOperation.CREDIT, 120_000);
        Transaction transaction3 = new Transaction("10110001-14811230-00000009", TransactionOperation.DEBIT, 100_000);

        TransactionSumCalculator tSumCalc = new TransactionSumCalculator();
    }
}
