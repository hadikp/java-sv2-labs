package operators;

public class HeadingNorth {
    public int getNumberOfNewDirections() {
        int counter = 1;
        int result = 0;
        for (int i = 1; i < 35; i++) {
            result += (10 * i);
            if (result == 360) {
               return counter;
            }
            counter++;
        } return counter;
    }

    public static void main(String[] args) {
        HeadingNorth hn = new HeadingNorth();
        System.out.println("A feladat megoldása: " + hn.getNumberOfNewDirections());
    }
}
