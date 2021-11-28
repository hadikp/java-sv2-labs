package objectclass.ancestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CommonAncestor {

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Apple apple = new Apple();
        Starking starking = new Starking();
        Vegetable vegetable = new Vegetable();
        List<Object> objectList = new ArrayList();

        objectList.add(fruit);
        objectList.add(apple);
        objectList.add(starking);
        objectList.add("alma");
        objectList.add(12);
        objectList.add('x');

        int[] arrayInt = new int[10];
        objectList.add(arrayInt);

        List<String> stringList = new ArrayList<>();
        objectList.add(stringList);

        LocalDate localData = LocalDate.of(2022, 11, 23);
        objectList.add(localData);

        System.out.println(objectList);
    }
}
