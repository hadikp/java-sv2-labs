package references.dog;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        Dog dog = new Dog("Frici", 3, "barna");
        System.out.println(dog);

        List<Dog> dogsList = new ArrayList<>();
        Dog dog2 = new Dog("Morzsa", 5, "fehér");
        Dog dog3 = new Dog("Stefi", 2, "fekete");
        dogsList.add(dog);
        dogsList.add(dog2);
        dogsList.add(dog3);

        System.out.println();
        System.out.println("A kutyás lista tartalma:");
        for (Dog d: dogsList) {
            System.out.println(d);
        }

        Dog dog4 = dog;
        dog4.setColour("pöttyös");
        System.out.println();
        System.out.println("A kutyás lista tartalma dog4 = dog után:");
        for (Dog d: dogsList) {
            System.out.println(d);
        }

        Dog dog5 = new Dog("Bodri", 1, "lila");
        System.out.println();
        System.out.println(dog5);
        dog5 = dogsList.get(1);
        System.out.println(dog5);
        dogsList.add(dog5);
        System.out.println();
        System.out.println("A kutyás lista tartalma add(dog5) után:");
        for (Dog d: dogsList) {
            System.out.println(d);
        }

        Dog dog6 = dog4;
        dog6.setColour("piros");
        System.out.println();
        System.out.println("A kutyás lista tartalma dog6.setColour(piros)) után:");
        for (Dog d: dogsList) {
            System.out.println(d);
        }

        List<Dog> dogsList2 = new ArrayList<>();
        dogsList2 = dogsList;
        Dog dog7 = dog4;
        dog7.setColour("színtelen");
        System.out.println();
        System.out.println("A kutyás lista tartalma dog7.setColour(színtelen)) után:");
        for (Dog d: dogsList2) {
            System.out.println(d);
        }

        dog2.setColour("lilás piros");
        System.out.println();
        System.out.println("A kutyás lista tartalma dog2.setColour(lilás piros)) után:");
        for (Dog d: dogsList2) {
            System.out.println(d);
        }

        dog2 = null;
        System.out.println();
        System.out.println("A kutyás lista tartalma dog2 = null) után:");
        for (Dog d: dogsList2) {
            System.out.println(d);
        }

        Dog dog8 = dog;
        dog8 = null;
        System.out.println();
        System.out.println("A kutyás lista tartalma dog8 = dog) után:");
        for (Dog d: dogsList2) {
            System.out.println(d);
        }

        Dog dog9 = dogsList.get(1);
        dog9.setColour("barna-barna");
        System.out.println();
        System.out.println("A kutyás lista tartalma dog2.setColour(barna-barna) után:");
        for (Dog d: dogsList2) {
            System.out.println(d);
        }
    }
}
