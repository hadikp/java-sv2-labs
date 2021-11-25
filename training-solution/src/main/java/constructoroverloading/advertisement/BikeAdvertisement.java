package constructoroverloading.advertisement;

import java.util.List;

public class BikeAdvertisement {

    private String description;
    private int price;
    private List<String> extrasList;
    private String brand;
    private String serialNumber;

    public BikeAdvertisement(String description, int price) {
        this.description = description;
        this.price = price;
    }

    public BikeAdvertisement(String description, int price, String brand) {
        this(description, price);
        this.brand = brand;
    }

    public BikeAdvertisement(String description, int price, List<String> extrasList, String brand) {
        this(description, price, brand);
        this.extrasList = extrasList;
    }

    public BikeAdvertisement(String description, int price, List<String> extrasList, String brand, String serialNumber) {
        this(description, price, extrasList, brand);
        this.serialNumber = serialNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public List<String> getExtrasList() {
        return extrasList;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
