package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {
        List<String> men = new ArrayList(Arrays.asList("Szabolcs", "Péter", "János", "Árpád", "Zoli", "Edina", "Enikő", "Melinda", "Zsófi", "Kálmán", "Árpád"));
        Random rnd = new Random();
        int num1 = rnd.nextInt(5) + 1;
        System.out.println("A lista elemének indexe: " + num1);
        int num2 = rnd.nextInt(5) + 6;
        System.out.println("A lista elemének indexe: " + num2);
        System.out.println("A nyertesek: " + men.get(num1) + " és " + men.get(num2));
    }
}
