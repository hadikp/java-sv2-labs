package arrayofarrays;

public class Rectangle {
    public void rectangularMatrix(int size) {
        int[][] rect = new int[size][size];
        /*for (int i = size; i > 0; i--) {
            rect[size-i] = new int[size];
        }*/

        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rect[j][i] = j;
            }
        }
        //kiíratás
        for(int i[]: rect) {
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
