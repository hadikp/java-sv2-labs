package collectionslist.food;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class FoodStoreM {

    private List<Food> foods = new LinkedList<>();

    public void addFood(Food food) {
        foods.add(food);
    }

    public List<Food> getFoods() {
        return new LinkedList<>(foods);
    }

    public void sellFirst(Food food) {
        printList();
        if (food.getExpirationTime().equals(LocalDate.now())) {
            foods.add(0, food);
        }
        printList();
    }

    private void printList() {
        for (Food f: foods) {
            System.out.println(f.getName());
        }
    }
}
