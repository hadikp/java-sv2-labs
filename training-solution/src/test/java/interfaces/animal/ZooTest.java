package interfaces.animal;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @Test
    void testGetNumberOfLegs() {
        Duck duck = new Duck();
        Lion lion = new Lion();
        Worm worm = new Worm();
        List<Animal> animalList = Arrays.asList(duck, lion, worm);
        Zoo zoo = new Zoo(animalList);
        assertEquals(6, zoo.getNumberOfLegs());
    }

}