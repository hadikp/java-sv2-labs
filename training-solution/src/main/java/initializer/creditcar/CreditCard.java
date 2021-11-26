package initializer.creditcar;

public class CreditCard {

    private long balance;
    private Currency currency;

    public CreditCard(long balance, Currency currency) {
        this.balance = balance;
        this.currency = currency;
    }

    public CreditCard(long balance) {
        this.balance = balance;
    }

    public boolean payment(long amount, Currency currency) { //kiadás
        Rate rate = new Rate();
        double kiadas = rate.valutaRate(amount, currency);
        long k = (long) kiadas;
        balance -= k;
        return true ;
    }

    public boolean payment(long amount) {
        balance -= amount;
        return true;
    }

    public long getBalance() {
        return balance;
    }
}
