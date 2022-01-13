package collectionsequalshash.person;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String TAJ;

    public Person(String name, int age, String TAJ) {
        this.name = name;
        this.age = age;
        this.TAJ = TAJ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(TAJ, person.TAJ);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TAJ);
    }
}
