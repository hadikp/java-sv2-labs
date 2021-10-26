package composition.person;

import classstructureattributes.Song;

import java.sql.SQLOutput;

public class PersonMain {
    public static void main(String[] args) {
        Address addressP = new Address("Magyarország", "Székesfehérvár", "Tóvárosi Ln 42.", "8000");
        Person person = new Person("Péter", "223344PA", addressP);
        System.out.println(person);
        Address address = new Address("Magyarország", "Veszprém", "Búzavirág ut 5.", "8200");
        person.correctData("János", "334455CD", address);
        System.out.println(person);

        person.moveTo(addressP);
        System.out.println(person.getName() + " elköltözött, új adatai");
        System.out.println(person);

        System.out.print("Metódusok láncolásával kiíratott városnév: ");
        System.out.println(person.getAddress(address).getCity());
    }
}
