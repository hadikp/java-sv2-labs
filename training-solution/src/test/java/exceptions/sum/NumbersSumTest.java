package exceptions.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {

    NumbersSum numbersSum = new NumbersSum();

    @Test
    void testGetSumInt() {
        int[] numbers = {1, 3, 5, 7, 10};
        assertEquals(26, numbersSum.getSum(numbers));
    }

    @Test
    void testArrayNumbersNull() {
        int[] numbersNull = null;
        Exception ex = assertThrows(IllegalArgumentException.class, () -> numbersSum.getSum(numbersNull));
        assertEquals("Numbers cannot be null!", ex.getMessage());

    }

    @Test
    void testGetSumArrayString() {
        String[] numbers = {"1", "3", "5", "7", "10"};
        assertEquals(26, numbersSum.getSum(numbers));
    }

    @Test
    void testArrayStringNotParseInt() {
        String[] numbers = {"1", "3", "5", "7", "10", "a"};
        Exception ex = assertThrows(IllegalArgumentException.class, () -> numbersSum.getSum(numbers));
        assertEquals("Input string cannot be parse to Integer!", ex.getMessage());
    }


}