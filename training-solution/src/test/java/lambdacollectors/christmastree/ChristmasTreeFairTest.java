package lambdacollectors.christmastree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasTreeFairTest {

    ChristmasTreeFair fair;

    @BeforeEach
    void init() {
        List<ChristmasTree> christmasTrees = Arrays.asList(
                new ChristmasTree(PineTreeType.NORDMANN, 1.23),
                new ChristmasTree(PineTreeType.NORDMANN, 1.78),
                new ChristmasTree(PineTreeType.SPRUCE, 0.60),
                new ChristmasTree(PineTreeType.SILVER, 2.54),
                new ChristmasTree(PineTreeType.SPRUCE, 2.82),
                new ChristmasTree(PineTreeType.SILVER, 0.96),
                new ChristmasTree(PineTreeType.SPRUCE, 1.46)
        );
        fair = new ChristmasTreeFair(christmasTrees);
    }

    @Test
    void testGetCountByType() {
        Map<PineTreeType, Long> expected = Map.of(
                PineTreeType.NORDMANN, 2L,
                PineTreeType.SILVER, 2L,
                PineTreeType.SPRUCE, 3L
        );

        assertEquals(expected, fair.getCountByType());
    }

}