package collectionslist.flower;

import java.util.LinkedList;
import java.util.List;

public class BunchOfFlowers {

    private List<String> flowers = new LinkedList<>();

    public void addFlower(String flower) {
        flowers.add(flower);
    }

    public void addFlowerInTheMiddle(String flower) {
        int flowerDb = flowers.size();
        if (flowerDb % 2 == 0) {
            flowers.add((flowerDb / 2), flower);
        } else {
            flowers.add(flowerDb/2, "flowers");
            flowers.add(flowerDb/2 + 2, "flowers");
        }
    }

    public List<String> getFlowers() {
        return new LinkedList<>(flowers);
    }
}
