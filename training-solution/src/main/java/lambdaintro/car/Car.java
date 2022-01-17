package lambdaintro.car;

public class Car {

    private String brand;
    private String type;
    private int price;
    private int length; //m-ben

    public Car(String brand, String type, int price, int length) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.length = length;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return brand + ": " + type + ", " + price + "Ft " + length + "m-es";
    }
}
