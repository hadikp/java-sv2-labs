package inheritancemethods.car;

public class Car {

    private double fuelRate; //fogyasztás, 100km-en ennyit fogyaszt
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double burnFuel) {
        fuel += burnFuel;
    }

    public void drive(int km) {
        double burnFuel;
        burnFuel = km / 100.0 * fuelRate;
        fuel -= burnFuel;
        if (fuel <= 0) {
            throw new IllegalArgumentException("Ennyi km-t nem tudsz menni, mert elfogy a benzin!");
        }
    }

    public double calculateRefillAmount() {
        return tankCapacity - fuel;
    }

    public boolean isPossibleKm(int km) {
        double possibleKm = fuel / fuelRate * 100; //ennyi km-t tud még megtenni fuel-nyi benzinnel
        return  km <= possibleKm;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
