package numbers;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Oldd meg ezt a feladatot!");
        System.out.println("((3 + 2) * 6 - 5) / 6 = ");
        System.out.println("Írd ide az eredményt! ");
        double result = sc.nextDouble();
        boolean examen = Math.abs(4.16666 - result) < 0.005;
        System.out.println("Az eredményed jó: " + examen);
    }
}
