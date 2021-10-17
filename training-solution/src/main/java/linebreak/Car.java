package linebreak;

public class Car {
    String brand;
    String type;

    public String getBrandAndTypeInSeparateLines(String brand, String type){
        String carType = brand + "\n" +
                type + "\n";
        return carType;
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getBrandAndTypeInSeparateLines("Skoda", "Fábia"));
    }
}

