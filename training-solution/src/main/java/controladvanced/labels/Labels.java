package controladvanced.labels;

public class Labels {
    public int[][] getTableOfNumbers(int number) {
        int[][] table = new int[number][number];
        table[0][0] = 1;
        //Task:
        for (int i = 0; i < number; i++) {
            if (i == 1) {
                break;
            }
            for (int j = 0; j < number; j++) {
                table[i][j] = (i + 1) + (j + 1);
            }
        }

        //Teszthez kell, tömb kiíratás
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(table[i][j]);
            }
        }
        return table;
    }



    public static void main(String[] args) {
        Labels labels = new Labels();
        labels.getTableOfNumbers(4);
    }
}
