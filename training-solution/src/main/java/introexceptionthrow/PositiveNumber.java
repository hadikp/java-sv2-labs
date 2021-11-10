package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {

    public int number() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy pozitív egész számot!");
        int number = sc.nextInt();
        if (number < 0) {
            throw new IllegalArgumentException("Pozitív számot kértem!");
        }
        return number;
    }


    public static void main(String[] args) {
        int posNum = new PositiveNumber().number();
        System.out.println(posNum);

    }
}
