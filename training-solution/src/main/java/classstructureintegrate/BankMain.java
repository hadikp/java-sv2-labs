package classstructureintegrate;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String owner = scanner.nextLine();
        System.out.println("What is your bank account number?");
        String accountNumber = scanner.nextLine();
        System.out.println("What is your balance?");
        int balance = scanner.nextInt();
        BankAccount account = new BankAccount(accountNumber, owner, balance);
        System.out.println(account.getInfo());

        account.deposit(10000);
        System.out.println("Plus 10000 FT");
        System.out.println(account.getInfo());

        account.withdraw(5000);
        System.out.println("Minus 5000 FT");
        System.out.println(account.getInfo());
    }
}
