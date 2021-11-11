package introexceptionthrow.Registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a neved!");
        Validation validation = new Validation();
        String name = sc.nextLine();

        try {
            System.out.println("Üdvözöllek kedves " + validation.validateName(name));
        }
        catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        System.out.println("Hány éves vagy?");
        String  age = sc.nextLine();

        try {
            validation.validateAge(age);
        }
        catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        String text = String.format("A regisztrációhoz megadtad a neved: %s, az életkorodat: %s", name, age);
        System.out.println(text);
        validation.registrationOk();

    }

}
