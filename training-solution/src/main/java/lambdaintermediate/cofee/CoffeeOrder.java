package lambdaintermediate.cofee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CoffeeOrder {

    private List<Coffee> coffeeList;
    private LocalDate dateTime;
    private Integer sumIncome;

    public CoffeeOrder(List<Coffee> coffeeList, LocalDate dateTime) {
        this.coffeeList = coffeeList;
        this.dateTime = dateTime;
    }

    public void sumPrice() {
        Integer sumPrice = coffeeList.stream().mapToInt(Coffee::getPrice).sum();
        setSumIncome(sumPrice);
    }

    public List<Coffee> getCoffeeList() {
        return new ArrayList<>(coffeeList);
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setSumIncome(Integer sumIncome) {
        this.sumIncome = sumIncome;
    }

    public Integer getSumIncome() {
        return sumIncome;
    }

    @Override
    public String toString() {
        return coffeeList + ", " + dateTime +   ", " + sumIncome;
    }
}
