package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Kérek egy egész számot!");
            int num = scanner.nextInt();
            sum += num;
        }
        System.out.println("A beírt számok összege: " + sum);
    }
}
