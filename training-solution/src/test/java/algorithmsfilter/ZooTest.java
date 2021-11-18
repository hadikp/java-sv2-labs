package algorithmsfilter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    Zoo zoo;

    @BeforeEach
    void init () {
       zoo = new Zoo(new ArrayList(Arrays.asList(new Animal("Zebra", 4), new Animal("Majom", 4),
               new Animal("Tyúk", 2), new Animal("Galamb", 2),
               new Animal("Zsiráf", 4))));
    }

    @Test
    void testAddAnimal () {
        zoo.addAnimal(new Animal("Viziló", 4));
        assertEquals(6, zoo.getAnimalList().size());
    }

    @Test
    void testAnimalSizeOfLegs () {
        assertEquals(2, zoo.getAnimalsWithNumberOfLegsGiven(2).size());
        assertEquals(3, zoo.getAnimalsWithNumberOfLegsGiven(4).size());
    }
}