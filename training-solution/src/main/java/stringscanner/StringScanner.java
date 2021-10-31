package stringscanner;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Írj be egy mondatot!"); //Ez egy olyan mondat, ami több tagmondatból áll
        String first = sc.nextLine();
        System.out.println(first);
        System.out.println("Írj be még egy összetett mondatot!"); //Ez pedig egy másik mondat, ami szintén megfelel a feladatnak
        String second = sc.nextLine();
        Scanner sc2 = new Scanner(second).useDelimiter(",");
        while (sc2.hasNext()) {
            System.out.println(sc2.next());
        }
    }
}
