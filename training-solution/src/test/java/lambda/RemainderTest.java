package lambda;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemainderTest {

    @Test
    void testChangeNumbersToRemaindersI() {
        List<Integer> input = Arrays.asList(45, 13, 64, 51, 92, 33);
        Remainder remainder = new Remainder();
        System.out.println(remainder.changeNumbersToRemainders(input, 3));

    }

}