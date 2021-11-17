package algorithmscount.height;

import java.util.List;

public class Height {

    public int countChildrenWithHeightGreaterThan (List<Integer> heightList, int heightLimitation) {
        int counter = 0;
        for (int h: heightList) {
            if (h > heightLimitation) {
                counter++;
            }
        }
        return counter;
    }
}
