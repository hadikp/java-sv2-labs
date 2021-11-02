package controlselection.greetings;

public class Greeting {
    public void greetings(int hour, int min) {
        int timeMin = 60 * hour + min;
        if (timeMin < 5 * 60 || timeMin > 20 * 60 ) {
            System.out.println("Jó éjt!");
        } else if (timeMin >= 9 * 60 && timeMin <= 18 * 60 + 30) {
            System.out.println("Jó napot!");
        } else if (timeMin > 18 * 60 + 30 && hour < 20 * 60) {
            System.out.println("Jó estét!");
        } else System.out.println("jó reggelt!");
    }

    public static void main(String[] args) {
        Greeting gret = new Greeting();
        gret.greetings(21, 10);
    }
}
