package looptypes;

import java.util.Arrays;
import java.util.List;

public class StudyGroup {
    public List printStudyGroups(List<String> students) {
        for (String student: students) {
            if (student.length() < 10) {
                System.out.println("Az 1-es tanulócsoportba kerültek: " + student);
            } else {
                System.out.println("A 2-es tanulócsoportba kerültek: " + student);
            }
        } return students;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hadik Péter", "Molnár Erika", "Annamária", "János", "Gergő", "Bodnár Erika");
        StudyGroup group = new StudyGroup();
        group.printStudyGroups(names);
    }
}
