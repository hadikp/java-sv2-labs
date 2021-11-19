package algorithmstransformation.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolTest {

    PrimarySchool school;

    @BeforeEach
    void init() {
        List<Person> personList = new ArrayList<>(Arrays.asList(new Person("Hadik Péter", 12, "Székesfehérvár"),
                new Person("Török János", 11, "Budapest"),
                new Person("Hadik Lajos", 70, "Bárna"),
                new Person("Molnár Ákos", 50, "Buda"),
                new Person("Kossuth Lajos", 55, "Segesvár")));
        personList.add(new Person("Erkel Ferenc", 14, "Pest"));
        school = new PrimarySchool(personList);

    }

    @Test
    void testStudentList () {
        String actual = school.getStudents().get(0).getName();
        System.out.println(actual);
        assertEquals("Hadik Péter", actual);
        assertEquals(3, school.getStudents().size());




    }
}