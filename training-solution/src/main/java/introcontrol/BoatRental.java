package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hányan vagytok?");
        int num = scanner.nextInt();
        if (num <= 2) {
            System.out.println("A csapat a 2 fős csónakot vitte el, és még 8 fő mehet utánuk");
        } else if (num == 3) {
            System.out.println("A csapat a 3 fős csónakot vitte el, és még 7 fő mehet utánuk");
        } else if (num <= 5) {
            System.out.println("A csapat az 5 fős csónakot vitte el, és még 5 fő mehet utánuk");
        } else if (num <= 7) {
            System.out.println("A csapat az 5 és a 2 fős csónakot vitte el, és még 3 fő mehet utánuk");
        } else if (num == 8) {
            System.out.println("A csapat az 5 és a 3 fős csónakot vitte el, és még 2 fő mehet utánuk");
        } else if (num <= 10) {
            System.out.println("A csapat elvitte mind a három csónakot, és senki sem mehet utánuk");
        } else {
            System.out.println("Elvitték mind a három csónakot, és a parton maradt még "+(num - 10)+ " ember.");
        }
    }
}
