package mathproblems;

public class DivisionMain {
    public static void main(String[] args) {
        Division div = new Division();
        div.getDivisors(12);

        int[] numbers = {2, 5, 23, 56, -36, 45, 78, 14, -8, 4, 10};
        div.getRightNumbers(numbers);
    }
}
