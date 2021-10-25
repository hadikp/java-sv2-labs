package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vizsgára jelentkező neve:");
        String name = sc.nextLine();
        System.out.println("Vizsgára jelentkező születési éve:");
        String yearOfBirthString = sc.nextLine();
        int yearOfBirth = Integer.parseInt(yearOfBirthString);
        System.out.println("Vizsgára jelentkező születési hónapja:");
        String yearOfMonthString = sc.nextLine();
        int yearOfMonth = Integer.parseInt(yearOfMonthString);
        System.out.println("Vizsgára jelentkező születési napja:");
        String yearOfDayString = sc.nextLine();
        int yearOfDay = Integer.parseInt(yearOfDayString);
        System.out.println("Irányítószám:");
        String zipcodeString = sc.nextLine();
        int zipcode = Integer.parseInt(zipcodeString);
        System.out.println("A tanfolyam osztályzatainak átlaga:");
        String averageString = sc.nextLine();
        double average = Double.parseDouble(averageString);

        Person person = new Person(name, LocalDate.of(yearOfBirth, yearOfMonth, yearOfDay), zipcode, average);
        System.out.println(person);
        Exam exam = new Exam();
        System.out.println(exam);
        exam.addPerson(person);
        System.out.println(exam);


    }
}
