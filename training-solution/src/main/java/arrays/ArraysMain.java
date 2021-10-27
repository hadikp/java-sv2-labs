package arrays;

import java.util.Arrays;

public class ArraysMain {
    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 31, 31};
        return Arrays.toString(numberOfDays);
    }

    public String multiplicationTableAsString(int size) {
        int[][] table = new int[size][size];
        for (int i = 0;i < size;i++){
            for (int j = 0;j < size;j++){
                table[i][j]=(i + 1)*(j + 1);
            }
        };
        return Arrays.deepToString(table);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

    public  boolean wonLottery(int[] lot, int[] win) {
        Arrays.sort(lot);
        Arrays.sort(win);
        return Arrays.equals(lot, win);

    }


    public static void main(String[] args) {
        ArraysMain numOfDay = new ArraysMain();
        System.out.println(numOfDay.numberOfDaysAsString());
        System.out.println(numOfDay.multiplicationTableAsString(4));

        double[] day1 = {22, 23, 34, 40};
        double[] day2 = {22, 23, 34, 40};
        System.out.println("A két nap azonos hőmérsékleti értékeket tartalmaz: " + numOfDay.sameTempValues(day1, day2));

        int[] lot = {11, 33, 89, 92, 67};
        int[] win = {33, 11, 89, 92, 67};
        System.out.println("A kihúzott és megtett számok azonosak: " + numOfDay.wonLottery(lot, win));
    }
}
