package isahasa.inhabitant;

public class Inhabitant extends Person {

    private ParkingPlace parkingPlace;

    public Inhabitant(String name, ParkingPlace parkingPlace) {
        super(name);
        this.parkingPlace = parkingPlace;
    }

    public void changeParkingPlace(int newNumber) {
        this.parkingPlace.setNumber(newNumber);
    }

    public ParkingPlace getParkingPlace() {
        return parkingPlace;
    }
}
