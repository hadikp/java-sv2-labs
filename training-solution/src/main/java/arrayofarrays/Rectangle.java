package arrayofarrays;

public class Rectangle {
    public void rectangularMatrix(int size) {
        int[][] a = new int[size][size];
        /*for (int i = size; i > 0; i--) {
            a[size-i] = new int[size];
        }*/

        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[j][i] = j;
            }
        }
        //kiíratás
        for(int i[]: a) {
            for(int j: i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Rectangle tetra = new Rectangle();
        tetra.rectangularMatrix(4);
    }
}
