package introexceptionfinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Írj be egy egész számot!");
        int number = 1;
        while (number % 2 != 0) {
            try {
                number = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException ime) {
                throw new IllegalArgumentException("Betűt írtál be szám helyett!", ime);
            }
            finally {
                System.out.println("Ennek a körnek vége!");
            }

        }
    }
}
