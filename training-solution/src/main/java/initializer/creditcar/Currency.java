package initializer.creditcar;

public enum Currency {

    HUF(1), EUR(365.8), SFR(351.9), GBP(454.2), USD(329.2);

    private final double amount;

    Currency(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
