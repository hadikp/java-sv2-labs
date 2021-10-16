package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Péter");
        client.setYear(1975);
        client.setAddress("Székesfehérvár, Tóvárosi Ln 42.");

        System.out.println("Az ügyfél neve: " +client.getName());
        System.out.println("Az ügyfél születési éve: " +client.getYear());
        System.out.println("Az ügyfél címe: " +client.getAddress());

        client.migrate("Salgótarján, Rákóci út 42.");
        System.out.println("Az ügyfél elköltözött, új címe: " + client.getAddress());
    }
}
