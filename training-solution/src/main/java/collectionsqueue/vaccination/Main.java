package collectionsqueue.vaccination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person peter = new Person("Péter", 50);
        Person eniko = new Person("Enikő", 44);
        Person marta = new Person("Márti", 40);
        Person jozsef = new Person("Józsi", 30);
        Person gyerek = new Person("Gyerek", 5);
        Person bacsi = new Person("Bácsi", 115);
        List<Person> people = new ArrayList<>(Arrays.asList(peter, eniko, marta, jozsef, gyerek, bacsi));
        Vaccination vaccination = new Vaccination();
        System.out.println(vaccination.getVaccinationOrder(people));
        System.out.println(vaccination.getVaccinationOrder(people).poll());
        System.out.println(vaccination.getVaccinationOrder(people).peek());


    }
}
