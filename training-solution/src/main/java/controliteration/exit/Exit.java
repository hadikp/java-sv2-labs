package controliteration.exit;

import java.util.Scanner;

public class Exit {
    public static void main(String[] args) {

        String push;
        do {
            System.out.println("Az ügyfélszolgálat menüje jelenleg nem elérhető. Kilépés: x billentyű megnyomásával");
            Scanner sc = new Scanner(System.in);
            push = sc.nextLine();

        } while (!"x".equals(push));

    }
}
