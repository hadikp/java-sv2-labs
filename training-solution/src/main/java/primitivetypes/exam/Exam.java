package primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private List<Person> listPerson = new ArrayList<>();

    public List<Person> getListPerson() {
        return listPerson;
    }

    public void addPerson(Person person) {
        listPerson.add(person);
    }


    @Override
    public String toString() {
        return "Exam{" +
                "listPerson=" + listPerson +
                '}';
    }
}
