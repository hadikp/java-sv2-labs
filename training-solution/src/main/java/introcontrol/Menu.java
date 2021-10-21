package introcontrol;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Felhasználók listázása");
        System.out.println("2. Felhasználók felvétele");
        System.out.println("Többi: Kilépés");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Felhasználók listázása");
                break;
            case 2:
                System.out.println("Felhasználók felvétele");
        }
    }
}
