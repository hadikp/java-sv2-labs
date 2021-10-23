package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        System.out.println(students.size());

        System.out.println(student1.isActive());
        student1.setActive(false);
        student2.setActive(false);
        System.out.println(student1.isActive());

        List<Student> elemsToRemove = new ArrayList<>();
        for (Student student: students) {
            if (student.isActive() == false) {
                elemsToRemove.add(student);
            }
        }
        students.removeAll(elemsToRemove);
        System.out.println(students.size());
    }
}
