package linebreak;

public class Car {
    String brand = "Skoda";
    String type = "Fábia";

    public String getBrandAndTypeInSeparateLines(String brand, String type){
        String carType = brand + "\n" +
                type + "\n";
        return carType;
    }

}

    public static void main(String[] args) {

    }