package exceptions.sum;

public class NumbersSum {

    public int getSum(int[] numbers) {
        int sum = 0;
        if (numbers == null) {
            throw new IllegalArgumentException("Numbers cannot be null!");
        }
        for (int n: numbers) {
            sum += n;
        }
        return sum;
    }

    public int getSum(String[] numbers) {
        int sum = 0;
        if (numbers == null) {
            throw new IllegalArgumentException("Numbers cannot be null!");
        }
        for (String st: numbers) {
            try {
                sum += Integer.parseInt(st);
            }
            catch (IllegalArgumentException iae) {
                throw new IllegalArgumentException("Input string cannot be parse to Integer!");
            }
        }
        return sum;
    }
}
