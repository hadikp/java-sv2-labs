package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] weekDays = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
        System.out.println("A hét második napja: " + weekDays[1]);
        System.out.println("A hét hossza: " + weekDays.length + " nap");

        int[] twoInvolve = new int[5];
        for (int i = 1; i < twoInvolve.length; i++) {
            twoInvolve[0] = 1;
            twoInvolve[i] = twoInvolve[i-1] * 2;
        }
        for (int involve: twoInvolve) {
            System.out.print(involve + " ");
        }

        boolean[] trueOrFalse = new boolean[6];
        for (int i = 1; i < trueOrFalse.length; i++) {
            trueOrFalse[0] = false;
            trueOrFalse[i] = !trueOrFalse[i-1];
        }
        System.out.println();
        for (boolean neg: trueOrFalse) {
            System.out.print(neg + " ");
        }

    }
}
