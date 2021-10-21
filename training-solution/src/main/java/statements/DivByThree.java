package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy egész számot!");
        int c = scanner.nextInt();
        if (c % 3 == 0) {
            System.out.println("A beírt szám osztható hárommal");
        } else System.out.println("A beírt szám nem osztható hárommal");
    }
}

