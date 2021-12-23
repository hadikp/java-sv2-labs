package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers {

    private int passengers;
    private final int maxPassengers;

    public CanCarryPassengersBehaviour(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int loadPassenger(int passengers) { //Beszálló utasok
        int restPassengers = 0;
        if (maxPassengers - passengers >= 0) {
            this.passengers = passengers;
        }
        if (maxPassengers - passengers < 0) {
            this.passengers = maxPassengers;
            restPassengers = passengers - maxPassengers;
        }
       return restPassengers;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }
}
