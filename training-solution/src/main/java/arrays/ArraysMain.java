package arrays;

import java.util.Arrays;

public class ArraysMain {
    String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 31, 31};
        return Arrays.toString(numberOfDays);
    }

    public static void main(String[] args) {
        ArraysMain numOfDay = new ArraysMain();
        System.out.println(numOfDay.numberOfDaysAsString());
    }
}
