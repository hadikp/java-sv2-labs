package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írj be egy számot!");
        int num = scanner.nextInt();

        if (num > 100) {
            System.out.println("Ez a szám nagyobb mint száz");
        } else{
            if (num == 100) {
                System.out.println("Ez a szám éppen száz");
            }
            if (num < 100) {
                System.out.println("Ez a szám kisebb mint száz");
            }
        }
    }
}
