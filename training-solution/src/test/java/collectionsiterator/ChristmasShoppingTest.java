package collectionsiterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasShoppingTest {

    ChristmasShopping christmasShopping;

    @BeforeEach
    void init() {
        ChristmasPresent kocka = new ChristmasPresent(1200, "Péter");
        ChristmasPresent konyv = new ChristmasPresent(5200, "Enikő");
        ChristmasPresent auto = new ChristmasPresent(7200, "Andriska");
        List<ChristmasPresent> presents = new ArrayList<>(Arrays.asList(kocka, konyv, auto));
        christmasShopping = new ChristmasShopping(presents);
    }

    @Test
    void testInit() {
        assertEquals(3, christmasShopping.getPresents().size());
    }

    @Test
    void testExpensivePresent1000() {
        christmasShopping.removeTooExpensivePresent(1000);
        assertEquals(0, christmasShopping.getPresents().size());
    }

    @Test
    void testExpensivePresent7000() {
        christmasShopping.removeTooExpensivePresent(7000);
        assertEquals(2, christmasShopping.getPresents().size());
    }

}