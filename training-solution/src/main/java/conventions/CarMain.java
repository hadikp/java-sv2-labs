package conventions;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Skoda", "Honda", 4, 5);

        System.out.println(car.getCarType());

        car.addModelName("Fábia");
        System.out.println(car.getCarType());

        System.out.println("Number of doors: " + car.getDoors());
        car.setDoors(6);
        System.out.println("Number of doors: " + car.getDoors());

    }
}
