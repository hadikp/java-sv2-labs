package stringtype.registration;

import java.util.Scanner;

public class RegistrationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserValidator userValid = new UserValidator();
        System.out.println("Username please!");
        String userName = scanner.nextLine();
        userValid.isValidUsername(userName);
        System.out.println(userName);
    }
}
