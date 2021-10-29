package numbers;

import java.util.Scanner;

public class Percent {
    public double getValue(int num1, int numPercent) {
        return  num1 * (numPercent / 100.0);
    }

    public double getBase(int num1, int numPercent) {
        return  num1 / (numPercent / 100.0);
    }

    public double getPercent(int num1, int num2) {
        return  100 * (num2 * 1.0 / num1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Percent percent = new Percent();
        System.out.println("Az első számnak a második szerinti százaléka: " + percent.getValue(200, 30));

        System.out.println("Kérek két egész számot!");
        int num1 = sc.nextInt();
        sc.nextLine();
        int numPercent = sc.nextInt();
        sc.nextLine();
        System.out.println("Melyik számnak a " +numPercent + " százaléka a " + num1 + ": " + percent.getBase(num1, numPercent));
        System.out.println("Az első számnak hány százaléka a második: " + percent.getPercent(60, 30));
    }
}
