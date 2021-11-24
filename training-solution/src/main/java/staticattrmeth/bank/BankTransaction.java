package staticattrmeth.bank;

public class BankTransaction {

    private static final long MIN_TRANSACTION_VALUE = 1;
    private static final long MAX_TRANSACTION_VALUE = 10_000_000;
    private static long countOfTransactions;
    private static long sumOfTransactions;
    private static long currentMinValue;
    private static long currentMaxValue;

    private long transactionValue;

    public BankTransaction(long transactionValue) {
        if (transactionValue < MIN_TRANSACTION_VALUE || transactionValue > MAX_TRANSACTION_VALUE) {
            throw new IllegalArgumentException("A tranzakció értéke nem megfelelő!");
        }
        this.transactionValue = transactionValue;
    }

    public static void initTheDay() {
        currentMinValue = 0;
        currentMaxValue = 0;
    }

    public static long getAverageOfTransaction() {
        return sumOfTransactions / countOfTransactions;
    }


}
