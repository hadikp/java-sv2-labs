package collectionsset.student;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {

    public Set<Integer> getOrderInLessons(List<Student> students) {
        Set<Integer> result = new TreeSet<>();
        for (Student s: students) {
            result.add(s.getHeight());
        }
        return result;
    }
}
