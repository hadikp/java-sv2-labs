package stringbuilder.airport;


import java.util.ArrayList;
import java.util.List;

public class Airport {
    private List<Flight> flights = new ArrayList<>();


    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void getDeletedFlight() {
        StringBuilder delFlight = new StringBuilder("Törölt járatok: \n");
        for (Flight fl: flights) {
            if ((fl.getStatus()).equals(Status.DELETED)) {
                delFlight.append(fl.getFlightNumber() + "\n");
            }
        }
        System.out.println(delFlight);
    }


    public static void main(String[] args) {
        Airport ferihegy = new Airport();
        Status active = Status.ACTIVE;
        Status deleted = Status.DELETED;
        Flight milano = new Flight("Mi-342", deleted);
        Flight frankfurt = new Flight("F-355", active);
        Flight london = new Flight("L-233", active);
        Flight moszkva = new Flight("Mo-112", deleted);
        System.out.println(milano.getFlightNumber());
        System.out.println(milano.getStatus());

        ferihegy.addFlight(milano);
        ferihegy.addFlight(frankfurt);
        ferihegy.addFlight(london);
        ferihegy.addFlight(moszkva);

        ferihegy.getDeletedFlight();
    }
}
