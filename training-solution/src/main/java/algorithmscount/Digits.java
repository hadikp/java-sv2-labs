package algorithmscount;

public class Digits {

    public int getCountOfNumbers () {
        int counter = 0;
        for (int i = 11; i < 100; i++) {
            String[] stringDigit = String.valueOf(i).split("");
            if (isDigitGood(stringDigit)) {
                counter++;
            }
        }
        return counter;
    }

    private boolean isDigitGood(String[] stringDigit) {
        return Math.abs(Integer.parseInt(stringDigit[0]) - Integer.parseInt(stringDigit[1])) == 5;
    }

    public static void main(String[] args) {
        Digits d = new Digits();
        System.out.println("Hány olyan kétjegyű pozitív egész szám van, amelyben az egyik számjegy 5-tel nagyobb a másiknál: " + d.getCountOfNumbers());

    }
}
