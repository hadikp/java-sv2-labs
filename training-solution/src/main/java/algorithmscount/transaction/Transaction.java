package algorithmscount.transaction;

public class Transaction {

    private String accountNumber;
    private TransactionType transactionType;
    private int amount;

    public Transaction(TransactionType transactionType, int amount) {
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public int getAmount() {
        return amount;
    }
}
