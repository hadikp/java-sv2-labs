package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write two integer numbers please!");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(number1 + " + " + number2);
        System.out.println("The result: " + (number1 + number2));

    }
}
