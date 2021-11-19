package algorithmstransformation.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimarySchool {

    private List<Person> personList;

    public PrimarySchool(List<Person> personList) {
        this.personList = personList;
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        for (Person p: personList) {
            if (p.getAge() >= 6 && p.getAge() <= 14) {
                Student student = new Student(p.getName(), p.getAddress());
                studentList.add(student);
            }
        }
        return studentList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public static void main(String[] args) {

        Person person = new Person("Török John", 50, "Bárna");
        //Class myClassP = peter.getClass();
       // System.out.println(myClassP.getTypeName());
        String myClassPer = person.getClass().getTypeName();
        System.out.println(myClassPer);

    }
}
