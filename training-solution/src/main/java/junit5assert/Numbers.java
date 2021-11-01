package junit5assert;

public class Numbers {

    private int[] numbers;

    public int[] getEvenNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = 0;
            }
        }
        return numbers;
    }

    public Numbers(int[] numbers) {
        this.numbers = numbers;
    }
}
