package collectionsset.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student peter = new Student("Péter", 170);
        Student eniko = new Student("Enikő", 165);
        Student janos = new Student("János", 160);
        Student gyerek = new Student("Gyerek", 130);
        List<Student> students = new ArrayList<>(Arrays.asList(peter, eniko, janos, gyerek));
        PhysicalEducation pe = new PhysicalEducation();
        System.out.println(pe.getOrderInLessons(students));

    }
}
