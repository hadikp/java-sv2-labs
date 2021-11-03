package controladvanced.labels;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.deepToString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LabelsTest {

    Labels label;
    @BeforeEach
    void init() {
        label = new Labels();


    }

    @Test
    void testgetTableOfNumbers() {
        int[][] table = {{2, 3, 4, 5},{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

        assertEquals(deepToString(table), deepToString(label.getTableOfNumbers(4)));

    }


}
