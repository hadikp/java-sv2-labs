package arrayofarrays;

public class Triangular {
    public void triangularMatrix(int size) {
        int[][] rect = new int[size][];

        for(int i = 0; i < size; i++) {
            rect[i] = new int[i+1];
            for (int j = 0; j <= i; j++) {
                rect[i][j] = i;
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
        Triangular tri = new Triangular();
        //int[][] arr = {{0}, {1, 1}, {2, 2, 2}};
        tri.triangularMatrix(4);
    }
}
