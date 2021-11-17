package algorithmssum;

import java.util.ArrayList;
import java.util.List;

public class SalesAmountSumCalculator {

    private List<Salesperson> personList = new ArrayList<>();

    public void addSalesperson (Salesperson salesperson) {
        personList.add(salesperson);
    }

    public int sumAmount () {
        int sum = 0;
        for (Salesperson sp: personList) {
            sum += sp.getAmount();
        }
        return sum;
    }

    public static void main(String[] args) {
        SalesAmountSumCalculator salesSum = new SalesAmountSumCalculator();
        Salesperson peter = new Salesperson("Péter", 1_200_000);
        Salesperson jozsi = new Salesperson("József", 1_000_000);
        Salesperson jakab = new Salesperson("Jakab", 1_000_000);

        salesSum.addSalesperson(peter);
        salesSum.addSalesperson(jozsi);
        salesSum.addSalesperson(jakab);

        System.out.println("A cég összes értékesítőjének árbevétele: " + salesSum.sumAmount());



    }
}
