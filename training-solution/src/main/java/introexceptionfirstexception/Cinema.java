package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a nevedet!");
        String name = sc.nextLine();
        System.out.println("Melyik filmet szeretnéd megnézni?");
        String filmTitle = sc.nextLine();
        /*System.out.println("Hány jegyet kérsz?");
        int number = sc.nextInt();
        sc.nextLine();*/
        System.out.println("Melyik sorba kéred a jegyet?");
        int row = sc.nextInt();
        sc.nextLine();

        String text = String.format("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők: \n" +
                     "Vásárló neve: %s \n Film címe: %s \n Lefoglalt helyek: %d. sor 1.szék, %d. sor 2.szék", name, filmTitle, row, row);

        System.out.println(text);
    }
}
