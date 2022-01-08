package searching.pike;

import java.util.Arrays;

public class Mountain {

    private int[] heights;

    public Mountain(int[] heights) {
        this.heights = heights;
    }

    public int searchPike(Pike pike) {
        return Arrays.binarySearch(heights, pike.getHeight());
    }
}
