package algorithmssum.transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionSumCalculator {

    private List<Transaction> transactionsList = new ArrayList<>();

    public void addTransactions (Transaction transaction) {
        transactionsList.add(transaction);
    }

    public int sumAmountOfCreditEntries() {
        int sum = 0;
        for (Transaction tr: transactionsList) {
            if (TransactionOperation.CREDIT == tr.getTransactionOperation()) {
               sum += tr.getAmount();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Transaction transaction1 = new Transaction("10110001-14811230-00000007", TransactionOperation.CREDIT, 120_000);
        Transaction transaction2 = new Transaction("10110001-14811230-00000008", TransactionOperation.CREDIT, 120_000);
        Transaction transaction3 = new Transaction("10110001-14811230-00000009", TransactionOperation.DEBIT, 100_000);

        TransactionSumCalculator calc = new TransactionSumCalculator();
        calc.addTransactions(transaction1);
        calc.addTransactions(transaction2);
        calc.addTransactions(transaction3);

        System.out.println(calc.sumAmountOfCreditEntries());

    }

}
