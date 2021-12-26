package exceptionmulticatch.aid.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryStringConverterTest {

    BinaryStringConverter binaryStr = new BinaryStringConverter();;

    @Test
    void testBooleanArrayIsNull() {
        boolean[] arr = null;
        NullPointerException ex = assertThrows(NullPointerException.class, () -> binaryStr.booleanArrayToBinaryString(arr));
        assertEquals("Null értékű paramétert adtál meg!", ex.getMessage());
    }

    @Test
    void testStringIsNull() {
        String arr = null;
        NullPointerException ex = assertThrows(NullPointerException.class, () -> binaryStr.binaryStringToBooleanArray(arr));
        assertEquals("Null értékű paramétert adtál meg!", ex.getMessage());
    }

    @Test
    void testStringToArray() {
        String data = "010111";
        boolean[] result = {false, true, false, true, true, true};
        assertArrayEquals(result, binaryStr.binaryStringToBooleanArray(data));
    }

    @Test
    void testArrayToString() {
        boolean[] arr = {true, false, false, true, true};
        assertEquals("10011", binaryStr.booleanArrayToBinaryString(arr));
    }

    @Test
    void testStringToArrayInput() {
        String data = "020111";
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> binaryStr.binaryStringToBooleanArray(data));
        assertEquals("A bemenő paraméter csak 0 és 1 lehet!", ex.getMessage());

    }

}