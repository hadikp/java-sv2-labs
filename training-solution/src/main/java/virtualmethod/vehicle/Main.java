package virtualmethod.vehicle;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(900);
        System.out.println(vehicle.toString());
        Car car = new Car(1000, 4);
        System.out.println(car);
        Van van = new Van(1000, 4, 300);
        System.out.println(van);
        FerryBoat ferryBoat = new FerryBoat(1000);
        ferryBoat.load(car);
        System.out.println(ferryBoat);
        ferryBoat.load(van);
        System.out.println(ferryBoat);
    }
}
