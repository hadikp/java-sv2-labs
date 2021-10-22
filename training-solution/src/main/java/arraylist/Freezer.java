package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {
    public static void main(String[] args) {

        List<String> foods = new ArrayList<>();
        foods.add("kaja");
        foods.add("macsánka");
        foods.add("nokedli");
        foods.add("palacsinta");
        foods.add("lecsó");

        System.out.println("A lista tartalma: " + foods.toString());
        System.out.println("A lista mérete: " + foods.size());
        System.out.println("A lista  első eleme: " + foods.get(0));
        foods.remove(0);
        foods.remove(1);
        System.out.println("A lista tartalma: " + foods.toString());
        System.out.println("A lista mérete: " + foods.size());
    }
}
