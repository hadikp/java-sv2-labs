package lambda;

import java.util.ArrayList;
import java.util.List;

public class Remainder {

    public List<Integer> changeNumbersToRemainders(List<Integer> numbers, int divisor) {
        numbers.replaceAll(num -> num % divisor);
        return numbers;
    }
}
