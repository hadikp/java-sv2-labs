package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Melyik számtól induljon a sor?");
        int num = sc.nextInt();
        for (int i = num; i < 20; i++) {

            if (i % 7 == 0) {
                System.out.print("x" + " ");
            } else {
                if (String.valueOf(i).contains("7")) {
                    break;
                }
                System.out.print(i + " ");
            }
        }
    }
}
