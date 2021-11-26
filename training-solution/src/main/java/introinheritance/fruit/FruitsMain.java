package introinheritance.fruit;

public class FruitsMain {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Fruit fruit = new Fruit();
        GoldenDelicious goldenDelicious = new GoldenDelicious();
        Grape grape = new Grape();
        Starking starking = new Starking();

        apple.setName("Apple");
        apple.setPieces(3);
        apple.setWeight(1.5);
        System.out.println("Neve: " + apple.getName() + " " + apple.getPieces() + " db, " + apple.getWeight() + " kg");

        fruit.setName("Fruits");
        fruit.setWeight(2.5);
        System.out.println("Neve: " + fruit.getName() + " " + fruit.getWeight() + " kg");

        goldenDelicious.setName("goldenDelicious");
        goldenDelicious.setPieces(33);
        goldenDelicious.setWeight(2.5);
        System.out.println("Neve: " + goldenDelicious.getName() + " " + goldenDelicious.getPieces() + " db, " +
                goldenDelicious.getWeight() + " kg " + "Színe: " + goldenDelicious.getColour());

        grape.setName("Grape");
        grape.setWeight(3.5);
        grape.setType("othello");
        System.out.println("Neve: " + grape.getName() + " " + grape.getWeight() + " kg Típusa: " + grape.getType());

        starking.setName("Starking");
        starking.setPieces(44);
        starking.setWeight(4.5);
        System.out.println("Neve: " + starking.getName() + " " + starking.getPieces() + " db, " +
                starking.getWeight() + " kg " + "Színe: " + starking.getColour());
    }
}
