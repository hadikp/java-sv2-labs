package composition.person;

public class Person {
    private String name;
    private String identificationCard;
    private Address address;

    public Person(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }
    //Address adr = new Address()
    public String moveTo(Address address) {
        //return address.correctData("Magyarország", "Veszprém", "Búzavirág ut 5.", "8200");
        return "11";
    }

    public Address getAddress(Address address) {
        return address;
    }

    public void correctData(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public String getName() {
        return name;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", identificationCard='" + identificationCard + '\'' +
                '}';
    }
}
