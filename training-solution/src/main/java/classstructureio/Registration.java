package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your name and email please!");
        String name = scanner.nextLine();
        String email = scanner.nextLine();
        System.out.println("Your name: " + name);
        System.out.println("Your email: " + email);
    }
}
