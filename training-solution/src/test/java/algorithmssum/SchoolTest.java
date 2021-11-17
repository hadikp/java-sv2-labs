package algorithmssum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchoolTest {

    School school;

    @BeforeEach
    void init() {
        school = new School();
    }

    @Test
    void testSum () {
        List<Integer> classList = Arrays.asList(11, 22, 11, 33, 22);
        assertEquals(99, school.getNumberOfStudents(classList));
    }
}
