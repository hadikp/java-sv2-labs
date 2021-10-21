package statements;

public class Investment {
    private double cost = 0.3;
    private int fund; //tőke
    private int interestRate;
    public boolean active = true;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
    }

    public int getFund() {
        return fund;
    }

    public boolean isActive() {

        return active;
    }

    public double getYield(double days) {
        return (days / 365 * fund * (interestRate * 0.01));
    }

    public double close(double days) {
        if (active == true) {
            double yield = (days / 365 * fund * interestRate * 0.01); //hozam
            double sum = fund + yield;
            active = false;
            return sum -= sum * 0.003;
        } else {
            active = false;
            return  0;
        }

    }
}
