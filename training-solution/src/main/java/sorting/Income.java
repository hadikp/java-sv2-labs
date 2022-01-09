package sorting;

import java.util.Arrays;

public class Income {

    private int[] revenues;

    public Income(int[] revenues) {
        this.revenues = revenues;
    }

    public int getHighestIncome() {
        Arrays.sort(revenues);
        return revenues[revenues.length-1];
    }

}
