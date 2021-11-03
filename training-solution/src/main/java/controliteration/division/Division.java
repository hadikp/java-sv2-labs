package controliteration.division;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív egész számot!");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int div = sc.nextInt();
        System.out.println(div + "-al osztható számok " + number + "-ig:");
        for (int i = 1; i < number; i++) {
            if (i % div == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
