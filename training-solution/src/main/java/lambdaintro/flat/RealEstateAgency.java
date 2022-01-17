package lambdaintro.flat;

import java.util.List;
import java.util.function.Predicate;

public class RealEstateAgency {

    private List<Flat> flats;

    public RealEstateAgency(List<Flat> flats) {
        this.flats = flats;
    }

    public Flat findFirstCheaperFlat(int minPrice) {
        return findFirst(flat -> flat.getPrice() < minPrice);
    }

    public Flat findFirstGreaterFlat(double maxArea) {
        return findFirst(flat -> flat.getArea() > maxArea);
    }

    public Flat findFirstFlatInSameTown(String town) {
        return findFirst(flat -> flat.getAddress().equals(town));
    }

    private Flat findFirst(Predicate<Flat> condition) {
        for (Flat f: flats) {
            if (condition.test(f)) {
                return f;
            }
        }
        throw new IllegalArgumentException("No such flat.");
    }
}
