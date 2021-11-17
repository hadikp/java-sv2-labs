package algorithmssum;

import java.util.Arrays;
import java.util.List;

public class School {

    public int getNumberOfStudents(List<Integer> headcounts) {
        int sum = 0;
        for (int i: headcounts) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        School school = new School();
        int sum = school.getNumberOfStudents(Arrays.asList(11, 22, 11, 33, 22));
        System.out.println(sum);

    }
}
