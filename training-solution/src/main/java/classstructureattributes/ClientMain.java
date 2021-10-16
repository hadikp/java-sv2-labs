package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your name!");
        client.name = scanner.nextLine();
        System.out.println("Your address:");
        client.address = scanner.nextLine();
        System.out.println("Year of birth:");
        client.yearOfBirth = scanner.nextInt();
        System.out.println("Client name: " + client.name);
        System.out.println("Client address: " + client.address);
        System.out.println("Client year of birth: " + client.yearOfBirth);
    }
}
