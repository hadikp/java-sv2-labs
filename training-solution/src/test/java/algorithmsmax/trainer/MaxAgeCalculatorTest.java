package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {

    MaxAgeCalculator maxAgeTrainer;

    @Test
    void testMaxAgeCalculator () {
        maxAgeTrainer = new MaxAgeCalculator();
        List<Trainer> maxAgeTrainerList = Arrays.asList(new Trainer("Péter", 55), new Trainer("Józsi", 33),
                new Trainer("János", 42), new Trainer("Piroska", 21));
        assertEquals(55, maxAgeTrainer.getTrainerWithMaxAge(maxAgeTrainerList).getAge());
    }

}