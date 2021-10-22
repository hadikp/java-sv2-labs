package arrayofarrays;

public class ArrayOfArrays {
    public void  printArrayOfArrays(int[][] a) {
        for (int i = 0; i < a[i].length; i++) {
            for(int j = 0; j < a[j].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayOfArrays arr = new ArrayOfArrays();
        int[][] arrays = {{0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}};
        arr.printArrayOfArrays(arrays);
    }
}
