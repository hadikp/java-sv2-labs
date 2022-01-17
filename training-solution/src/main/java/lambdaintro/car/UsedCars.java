package lambdaintro.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsedCars {

    private List<Car> sellCars;

    public UsedCars(List<Car> sellCars) {
        this.sellCars = sellCars;
    }

    public List<Car> listCarsByPrice() {
        List<Car> result = new ArrayList<>(sellCars);
        result.sort((car, car2) -> Integer.valueOf(car.getPrice()).compareTo(car2.getPrice()));
        //Collections.sort(result, Comparator.comparing(Car::getPrice));
        return result;
    }

    public List<Car> listCarsByLengthDesc() {
        List<Car> result = new ArrayList<>(sellCars);
        Collections.sort(result, Comparator.comparing(Car::getLength).reversed());
        return result;
    }

    public List<Car> listCarsOneBrandByType(String brand) {
        List<Car> result = new ArrayList<>();
        for (Car c: sellCars) {
            if (c.getBrand().equals(brand)) {
                result.add(c);
            }
        }
        Collections.sort(result, Comparator.comparing(Car::getType));
        return result;
    }
}
