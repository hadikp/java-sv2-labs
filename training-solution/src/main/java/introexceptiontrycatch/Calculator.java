package introexceptiontrycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        try{
            System.out.println("Kérek két számot!");
            num1 = sc.nextInt();
            sc.nextLine();
            num2 = sc.nextInt();
            sc.nextLine();
        }
        catch (InputMismatchException ime) {
            System.out.println("Szám helyett betűt írtál!");
        }

        System.out.println("Milyen műveletet végezzen el a gép? (+, -, *, /)");
        String operation = sc.nextLine();

        switch (operation) {
            case "+":
                System.out.println( num1 + num2);
               break;
            case "-":
                System.out.println( num1 - num2);
                break;
            case "*":
                System.out.println( num1 * num2);
                break;
            case "/":
                System.out.println( num1 / num2);
                break;
        }
    }

}
