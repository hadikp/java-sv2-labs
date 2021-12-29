package collectionslist.food;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class FoodStore {

    private List<Food> foods = new LinkedList<>();

    public void addFood(Food food) {
        foods.add(food);
    }

    public void sellFirst(Food food) {
        printList();
        Food transfer = foods.get(0);
        int index = -1;
        for (int i = 0; i < foods.size(); i++) {
            int expiration = (LocalDate.now()).compareTo(foods.get(i).getExpirationTime());

            //System.out.println(expiration);
            if (expiration == 0) {
                transfer = foods.get(i);
                index = i;
            }

        }
        foods.add(0, transfer);
        foods.remove(index+1);
        System.out.println();
        printList();
    }

    private void printList() {
        for (Food f: foods) {
            System.out.println(f.getName());
        }
    }

    public List<Food> getFoods() {
        return foods;
    }
}
