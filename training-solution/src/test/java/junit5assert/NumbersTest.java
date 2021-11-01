package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersTest {

    @Test
    void testGetEvenNumbers() {
        int[] arr = {2, 8, 5, 6, 2, 3, 9};
        Numbers num = new Numbers(arr);
        assertArrayEquals(new int[]{2, 8, 0, 6, 2, 0, 0}, num.getEvenNumbers());
    }
}
