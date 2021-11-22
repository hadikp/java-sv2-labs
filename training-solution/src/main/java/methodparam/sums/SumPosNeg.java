package methodparam.sums;

public class SumPosNeg {

    private double sumPositive;
    private double sumNegative;

    public SumPosNeg(double sumPositive, double sumNegative) {
        this.sumPositive = sumPositive;
        this.sumNegative = sumNegative;
    }

    public double getSumPositive() {
        return sumPositive;
    }

    public double getSumNegative() {
        return sumNegative;
    }
}
