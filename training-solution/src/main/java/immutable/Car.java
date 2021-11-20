package immutable;

public class Car {
    private final String brand;
    private final String type;
    private final int yearOfProduct;

    public Car(String brand, String type, int yearOfProduct) {
        if (brand == null || brand == "" || yearOfProduct > 2021) {
            throw new IllegalArgumentException("Hibás adatokat adtál meg!");
        }
        this.brand = brand;
        this.type = type;
        this.yearOfProduct = yearOfProduct;

    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduct() {
        return yearOfProduct;
    }
}
