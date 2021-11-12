package introexceptionthrowjunit5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private List<Integer> noteList = new ArrayList(Arrays.asList(4, 5, 5, 3, 2));

    public void addNote(int note) {
        if (note < 1 || note > 5) {
            throw new IllegalArgumentException("Note must be between 1 and 5!");
        }
        noteList.add(note);
    }

    public List<Integer> getNoteList() {
        return noteList;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getNoteList());

    }
}
