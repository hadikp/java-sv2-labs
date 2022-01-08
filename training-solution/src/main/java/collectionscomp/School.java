package collectionscomp;

import java.text.Collator;
import java.util.*;

public class School {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new StudentComparator());
        Student peter = new Student("Péter", 170);
        Student janos = new Student("János", 160);
        Student andris = new Student("András", 180);
        Student juci = new Student("Juci", 155);
        students.add(peter);
        students.add(janos);
        students.add(andris);
        students.add(juci);
        System.out.println(students);

        Map<String, Integer> studentMap = new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));
        studentMap.put("Péter", 170);
        studentMap.put("Ákos", 155);
        studentMap.put("Juci", 165);
        studentMap.put("András", 180);
        studentMap.put("Áron", 190);
        studentMap.put("Éva", 150);
        System.out.println(studentMap);

    }
}
