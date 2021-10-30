package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {
        private List<Student> studentsList = new ArrayList<>();

       public void addStudent(Student student) {
               studentsList.add(student);
       }

       public boolean areEqual(Student student, Student anotherStudent) {
               if ((student.getAzon()).equals(anotherStudent.getAzon())  && student.getNeptun().equals(anotherStudent.getNeptun())) {
                       return true;
               }
               return false;
       }

        public List<Student> getStudentsList() {
                return studentsList;
        }
}
