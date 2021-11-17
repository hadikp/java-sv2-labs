package algorithmssum;

public class TwoDigitEvens {

    public int getSum () {
        int sum = 0;
        int i;
        for (i = 11; i < 100; i++) {
            if (i % 5 != 0) {
                if (isEven(i)) {
                    sum += i;
                }
            }
        }
        return sum;
    }

    private boolean isEven (int i) {
        return (i % 2) != 0;
    }

    public static void main(String[] args) {
        TwoDigitEvens sum = new TwoDigitEvens();

        System.out.println("Az összes olyan kétjegyű pozitív egész páratlan szám összege ami nem osztható 5-el: " + sum.getSum());
    }
}
