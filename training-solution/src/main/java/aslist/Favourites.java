package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> favouriteThings = new ArrayList<>();

        System.out.println("Kedvenc ételed?");
        String food = sc.nextLine();
        favouriteThings.add(food);

        System.out.println("Kedvenc filmed?");
        String film = sc.nextLine();
        favouriteThings.add(film);

        System.out.println("Kedvenc állatod?");
        String animal = sc.nextLine();
        favouriteThings.add(animal);
        System.out.println("A lista mérete: " + favouriteThings.size());
        System.out.println("A lista tartalma: " + favouriteThings.toString());
    }


}
