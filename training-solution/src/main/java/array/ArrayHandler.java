package array;

public class ArrayHandler {

    public void addIndexToNumber(int[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = source[i] + i;
        }
        for (int sr: source) {
           System.out.println(sr);
        }
        for (int sr: source) {
            System.out.print(sr + " ");
        }
    }

    public void concatenateIndexToWord(String[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = i + source[i];
        }
        for (String str: source) {
            System.out.println(str);
        }
        for (String str: source) {
            System.out.print(str + " ");
        }
    }

    public static void main(String[] args) {
        ArrayHandler arr = new ArrayHandler();
        int[] intArray = {1, 2, 4, 5};
        arr.addIndexToNumber(intArray);

        String[] strArray = {"ABBA", "kutya", "macska", "derelye"};
        arr.concatenateIndexToWord(strArray);
    }
}
