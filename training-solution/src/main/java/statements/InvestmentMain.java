package statements;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A befektetés összege:");
        int fund = scanner.nextInt();
        System.out.println("Kamatláb:");
        int interestRate = scanner.nextInt();

        Investment inv = new Investment(fund, interestRate);
        System.out.println("Tőke: " + inv.getFund());
        System.out.println("Hozam 50 napra: " + inv.getYield(50));
        System.out.println("Kivett összeg 80 nap után: "  + inv.close(80));
        System.out.println("Kivett összeg 90 nap után: "  + inv.close(90));
    }
}
