package collectionslist.food;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FoodStoreTest {

    FoodStore foodStore;
    Food paprika;
    Food uborka;
    Food retek;

    @BeforeEach
    void init() {
        foodStore = new FoodStore();
        paprika = new Food("paprika", LocalDate.of(2021, 12, 21));
        uborka = new Food("uborka", LocalDate.of(2021, 12, 23));
        Food salata = new Food("salata", LocalDate.of(2021, 12, 11));
        retek = new Food("retek", LocalDate.of(2021, 12, 29));
        foodStore.addFood(paprika);
        foodStore.addFood(uborka);
        foodStore.addFood(salata);
        foodStore.addFood(retek);
        //foodStore.addFood(paprika);
    }

    @Test
    void testList() {
        assertEquals(4, foodStore.getFoods().size());
    }

    @Test
    void testSellFirst() {

        foodStore.sellFirst(uborka);

    }
}