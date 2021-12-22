package virtualmethod.vehicle;

public class Car extends Vehicle {

    private int numberOfPassenger; //utasok száma sofőr nélkül

    public Car(int vehicleWeight, int numberOfPassenger) {
        super(vehicleWeight);
        this.numberOfPassenger = numberOfPassenger;
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + numberOfPassenger * PERSON_AVERAGE_WEIGHT;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfPassenger=" + numberOfPassenger + ", vehicleWeight=" + getGrossLoad() +
                '}';
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }
}
