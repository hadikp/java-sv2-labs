package lambdastreams.baseoperations;

import java.util.*;
import java.util.stream.Collectors;

public class Operations {

   private List<Integer> numbers;

    public Operations(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Optional<Integer> min() {
        return numbers.stream().min(Comparator.naturalOrder());
    }

    public Integer sum() {
        return numbers.stream().mapToInt(i -> i).sum();
        //return numbers.stream().reduce(0, (a, b) -> a + b);
    }

    public boolean isAllPositive() {
        return numbers.stream().allMatch(integer -> integer > 0);
    }

    public Set<Integer> getDistinctElements() {
        Set<Integer> result = new HashSet<>();
        result = numbers.stream().collect(Collectors.toSet());
        return result;
    }
}
