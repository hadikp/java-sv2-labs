package lambdaoptional.costume;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CostumerTest {

    Costumer costumer;

    @BeforeEach
    void init() {
        Costume ruha = new Costume("ruha", Size.S, 1200);
        Costume cipo = new Costume("cipö", Size.M, 2200);
        Costume polo = new Costume("polo", Size.S, 200);
        Costume ing = new Costume("ing", Size.S, 300);
        List<Costume> costumes = Arrays.asList(ruha, cipo, polo, ing);
        costumer = new Costumer(costumes);
    }

    @Test
    void testFindFirstCostumeWithKeyWord() {
        assertTrue(costumer.findFirstCostumeWithKeyWord("polo").isPresent());
        assertFalse(costumer.findFirstCostumeWithKeyWord("polok").isPresent());
    }

    @Test
    void testFindFirstCheaperCostume() {
        assertEquals("polo", costumer.findFirstCheaperCostume(300).get().getDescription());
    }

    @Test
    void testFindFirstCostumeSameSize() {
        System.out.println(costumer.findFirstCostumeSameSize(Size.M));
        System.out.println(costumer.findFirstCostumeSameSize(Size.XL));
    }

}