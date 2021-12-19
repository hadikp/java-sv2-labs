package interfacedependencyinversion.amount;

public class Cash implements Payable {

    @Override
    public int getPayableAmount(int amount) {
        int rest = amount % 10; //maradék
        if (rest == 1 || rest == 2) {
            return amount - rest;
        } else if (rest == 3 || rest == 4 || rest == 6 || rest == 7) {
            return amount - rest + 5;
        } else if (rest == 8 || rest == 9) {
            return amount - rest + 10;
        }
        return amount;
    }
}
