package algorithmsmax.sales;

public class SalesPerson {
    private String name;
    private int amount; //elért árbevétel
    private int target; //előírt árbevétel

    public SalesPerson(String name, int amount, int target) {
        this.name = name;
        this.amount = amount;
        this.target = target;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getTarget() {
        return target;
    }

    public int getAmountMinusTarget() {
        return amount - target;
    }

}
