package inheritancemethods.car;

public class Jeep extends Car {

    private double extraFuel;
    private double extraCapacity;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraFuel, double extraCapacity) {
        super(fuelRate, fuel, tankCapacity);
        this.extraFuel = extraFuel;
        this.extraCapacity = extraCapacity;
    }

    @Override
    public void drive(int km) {
        setFuel(getFuel() + extraFuel);
        super.drive(km);

    }

    @Override
    public double calculateRefillAmount() {
        setFuel(getFuel() + extraFuel);
        return super.calculateRefillAmount();
    }
}
