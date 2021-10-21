package stringtype.registration;

import java.util.Scanner;

public class RegistrationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserValidator userValid = new UserValidator();
        //System.out.println("Username please!");
        //String userName = scanner.nextLine();
        //System.out.println("Username is good: " + userValid.isValidUsername(userName));

        System.out.println("Password please!");
        String pass1 = scanner.nextLine();
        System.out.println("Password please again!");
        String pass2 = scanner.nextLine();
        System.out.println("A password felvétele sikeres: " + userValid.isValidPassword(pass1, pass2));

    }
}
