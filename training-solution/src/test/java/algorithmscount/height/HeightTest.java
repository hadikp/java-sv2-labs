package algorithmscount.height;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeightTest {

    Height h;

    @Test
    void testHeight () {
        h = new Height();
        List<Integer> heightList = Arrays.asList(132, 121, 144, 160, 111);
        int actual = h.countChildrenWithHeightGreaterThan(heightList, 120);
        assertEquals(4, actual);
    }
}
