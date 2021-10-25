package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {

    public String fullName(String surname, String firstname) {
        return surname + " " + firstname;
    }

    public LocalDate dateOfBirth(int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        return LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Írd be a vezetékneved!");
        String surname = sc.nextLine();
        System.out.println("Írd be a keresztneved!");
        String firstname = sc.nextLine();

        System.out.println("Születési éved?");
        int yearOfBirth = sc.nextInt();
        sc.nextLine();
        System.out.println("Melyik hónapban születtél?");
        int monthOfBirth = sc.nextInt();
        sc.nextLine();
        System.out.println("Melyik napon születtél?");
        int dayOfBirth = sc.nextInt();
        sc.nextLine();

        System.out.println("Mi az email címed?");
        String email = sc.nextLine();

        Registration reg = new Registration();
        Person person = new Person(reg.fullName(surname, firstname), reg.dateOfBirth(yearOfBirth, monthOfBirth, dayOfBirth), email);

        System.out.println(person);

    }
}
