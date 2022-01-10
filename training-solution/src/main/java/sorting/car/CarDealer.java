package sorting.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarDealer {

    private List<Car> saledCars = new ArrayList<>();

    public void addCar(Car car) {
        saledCars.add(car);
    }

    public List<Car> getCarsOrderedByYearOfConstruction() {
        List<Car> result = new ArrayList<>(saledCars);
        Collections.sort(result, new CarConstructionComparator());
        return result;
    }

    public List<Car> getCarsOrderedByPrice() {
        List<Car> result = new ArrayList<>(saledCars);
        Collections.sort(result, new CarPriceComparator());
        return result;
    }

    public List<Car> getSaledCars() {
        return new ArrayList<>(saledCars);
    }
}
