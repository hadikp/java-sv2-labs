package lambdacollectors.christmastree;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ChristmasTreeFair {

    private List<ChristmasTree> christmasTrees;

    public ChristmasTreeFair(List<ChristmasTree> christmasTrees) {
        this.christmasTrees = christmasTrees;
    }

    public Map<PineTreeType, Long> getCountByType() {
        Map<PineTreeType, Long> countByType = christmasTrees.stream().collect(Collectors.groupingBy(ChristmasTree::getType,
                Collectors.counting()));
        return countByType;
    }
}
