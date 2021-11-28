package inheritancemethods.plane;

public class Plane {

    public static void main(String[] args) {
        Passenger passenger = new Passenger("Péter", 100_000);
        PriorityPassenger priorityPassenger = new PriorityPassenger("János", 100_000, 30);
        FirstClassPassenger firstClassPassenger = new FirstClassPassenger("Enikő", 100_000, 30);

        System.out.println("Név: " + passenger.getName() + ", Ár: " + passenger.getPriceOfPlaneTicket());
        System.out.println("Név: " + priorityPassenger.getName() + ", Ár: " + priorityPassenger.getPriceOfPlaneTicket());
        System.out.println("Név: " + firstClassPassenger.getName() + ", Ár: " + firstClassPassenger.getPriceOfPlaneTicket());

    }
}
