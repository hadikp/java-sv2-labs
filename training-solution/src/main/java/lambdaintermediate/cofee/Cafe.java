package lambdaintermediate.cofee;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Cafe {

    private List<CoffeeOrder> orders;

    public Cafe(List<CoffeeOrder> orders) {
        this.orders = orders;
    }

    public void addList(CoffeeOrder coffeeOrder) {
        orders.add(coffeeOrder);
    }

    public Integer getTotalIncome() {
        return orders.stream().mapToInt(CoffeeOrder::getSumIncome).sum();
    }

    public Integer getTotalIncome(LocalDate date) {
        return orders.stream().filter(order -> order.getDateTime().equals(date)).mapToInt(CoffeeOrder::getSumIncome).sum();
    }

    public long getNumberOfCoffee(CoffeeType type) {
        return orders.stream().flatMap(m -> m.getCoffeeList().stream()).filter(order -> order.getCoffeeType() == type).count();
    }

    public List<CoffeeOrder> getOrdersAfter(LocalDate from) {
        return orders.stream().filter(order -> order.getDateTime().isAfter(from)).collect(Collectors.toList());
    }

    public List<CoffeeOrder> getFirstFiveOrder(LocalDate date) {
        return orders.stream().limit(3).filter(order -> order.getDateTime().equals(date)).collect(Collectors.toList());
    }
}
