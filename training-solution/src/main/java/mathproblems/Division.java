package mathproblems;

public class Division {
    public void getDivisors(int number) {
        for (int i = 1; i <= number; i++) {
            if ((number % i) == 0) {
                System.out.println(number + " osztója: " + i);
            }
        }
    }

    public void getRightNumbers(int[] numbers) {
        System.out.print("A következő számok oszthatóak a tömbbeli indexükkel: ");
        for (int i = 1; i < numbers.length; i++) {
            if ((numbers[i] % i) == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
