package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Time time = new Time(7, 12, 33);
        Time time2 = new Time(6, 10, 11);
        System.out.println("Az első időpont: " + time.toString() + " = " + time.getInMinutes() + " perc");
        System.out.println("Az második időpont: " + time2.toString() + " = " + time2.getInSeconds() + " másodperc");
        System.out.println("Az első korábbi, mint a második: " + time.earlierThan(time, time2));
    }
}
