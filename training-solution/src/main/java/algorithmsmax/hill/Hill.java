package algorithmsmax.hill;

import java.util.List;

public class Hill {
    public int getMax(List<Integer> higherHill) {
        int max = higherHill.get(0);
        for (int h: higherHill) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }
}
