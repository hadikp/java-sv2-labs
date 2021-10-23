package math;

import java.util.Random;

public class MathMethods {
    public static void main(String[] args) {
        System.out.println(Math.max(10, 100));
        System.out.println(Math.min(10, 100));
        System.out.println(Math.PI);
        System.out.println(Math.round(Math.PI));
        System.out.println(Math.round(5.443)); //kerekítés
        System.out.println(Math.abs(-20));
        System.out.println(Math.negateExact(1)); //ellentéte
        System.out.println(Math.addExact(2, 5)); //összege
        System.out.println(Math.subtractExact(20, 10)); //különbség
        System.out.println(Math.multiplyExact(10, 20)); //szorzat
        System.out.println(Math.pow(2, 3)); //2 a harmadikon
        System.out.println();
        System.out.println(Math.decrementExact(4));
        System.out.println(Math.incrementExact(4));
        Random rnd = new Random();
        System.out.println(rnd.nextDouble()); //0 és 1 közötti lebegőpontos szám
    }
}
