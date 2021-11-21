package methodstructure.pendrives;

import java.util.Arrays;
import java.util.List;

public class Pendrives {

    private String name;
    private int capacity; //GB
    private int price;

    public Pendrives(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public void risePrice(int percent) {
        price += percent * price / 100;
    }

    public int comparePricePerCapacity(Pendrives other) {
        int priceCapacity = this.price / this.capacity;
        int priceCapacityOther = other.price / other.capacity;
        if (priceCapacity > priceCapacityOther) {
            return 1;
        } else if (priceCapacity < priceCapacityOther) {
            return -1;
        }
        return 0;
    }

    public boolean isCheaperThan(Pendrives other) {
        if (this.price < other.price) {
            return true;
        }
        return false;
    }

    public Pendrives getBest(List<Pendrives> pendriveList) {
        Pendrives minPen = pendriveList.get(0);
        for (Pendrives pen: pendriveList) {
            if (minPen.comparePricePerCapacity(pen) == 1) {
                minPen = pen;
            }
        }
        return minPen;
    }

    public Pendrives getCheapest(List<Pendrives> pendriveList) {
        Pendrives cheaperPen = pendriveList.get(0);
        for (Pendrives pen: pendriveList) {
            if (pen.isCheaperThan(cheaperPen)) {
                cheaperPen = pen;
            }
        }
        return cheaperPen;
    }

    public void risePriceWhereCapacity(List<Pendrives> pendriveList, int percent, int capacity) {
        for (Pendrives pen: pendriveList) {
            if (pen.capacity == capacity) {
                pen.risePrice(percent);
                System.out.println(pen.price);
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pendrives: " +
                "name=" + name +
                ", capacity=" + capacity +
                ", price=" + price;
    }

    public static void main(String[] args) {
        Pendrives p = new Pendrives("Drive", 33, 3500);
        Pendrives otherP = new Pendrives("Drive", 33, 2500);

        System.out.println(p);
        System.out.println(p.comparePricePerCapacity(otherP));
        System.out.println(p.isCheaperThan(otherP));

        List<Pendrives> pendrivesList = Arrays.asList(new Pendrives("pen1", 11, 1000),
                new Pendrives("pen2", 11, 2000),
                new Pendrives("pen3", 11, 500),
                new Pendrives("pen4", 23, 4000));
        System.out.println( p.getBest(pendrivesList));
        System.out.println(p.getCheapest(pendrivesList));
        p.risePriceWhereCapacity(pendrivesList, 10, 23);
    }
}
