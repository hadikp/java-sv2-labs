package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

    private List<Ship> ships = new ArrayList<>();
    private int waitingPersons;
    private int waitingCargo;

    public void addShip(Ship ship) {
        ships.add(ship);
    }

    public void loadShip(int passengers, int cargoWeight) {
        int restPeople = passengers;
        int restWeight = cargoWeight;
        for (Ship s: ships) {
            if (s instanceof CanCarryPassengers) {
                restPeople = ((CanCarryPassengers) s).loadPassenger(restPeople);
            }
            if (s instanceof CanCarryGoods) {
                restWeight = ((CanCarryGoods) s).loadCargo(restWeight);
            }
        }
        if (restPeople != 0) {
            waitingPersons = restPeople;
        }
        if (restWeight != 0) {
            waitingCargo = restWeight;
        }
    }

    public int getWaitingPersons() {
        return waitingPersons;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
