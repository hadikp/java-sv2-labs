package algorithmscount.transaction;

import java.util.List;

public class TransactionCounter {

    public int accountNumber (List<Transaction> transactionsList, int upperLimit) {
        int counter = 0;
        for (Transaction tr: transactionsList) {
            if (tr.getTransactionType() == TransactionType.CREDIT) {
                if (isUpperLimit(tr, upperLimit)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    private boolean isUpperLimit(Transaction tr, int upperLimit) {
        return tr.getAmount() < upperLimit;
    }
}
