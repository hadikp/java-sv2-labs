package arrayofarrays;

public class DailyValues {
    void getValues() {
        int[][] year = new int[12][];
        year[1]= new int[28];
        int[] month31 = {0, 2, 4, 6, 7, 9, 11};
        int[] month30 = {3, 5, 8, 10};

        for (int month: month31) {
            year[month] = new int[31];
        }
        for (int month: month30) {
            year[month] = new int[30];
        }

        //kiíratás
        for(int i[]: year) {
            for(int j: i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DailyValues numOfDays = new DailyValues();
        numOfDays.getValues();
    }
}
