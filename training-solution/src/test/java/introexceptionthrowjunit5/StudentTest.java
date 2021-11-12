package introexceptionthrowjunit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {

    Student student;

    @BeforeEach
    void init() {
        student = new Student();
        student.addNote(2);
        student.addNote(1);
        student.addNote(3);
    }

    @Test
    void testAddList() {
        List<Integer> getAddList = Arrays.asList(4, 5, 5, 3, 2, 2, 1, 3);
        assertEquals(getAddList, student.getNoteList());
    }

    @Test
    void testCreateGoodNote() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,  () -> student.addNote(0));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }
}
