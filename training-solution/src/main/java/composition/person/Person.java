package composition.person;

public class Person {
    private String name;
    private String identificationCard;
    private Address address;

    public Person(String name, String identificationCard, Address address)  {
        this.name = name;
        this.identificationCard = identificationCard;
        this.address = address;
    }

    public void moveTo(Address address) {
         this.address = address;
    }

    public Address getAddress(Address address) {
        return address;
    }

    public void correctData(String name, String identificationCard, Address address) {
        this.name = name;
        this.identificationCard = identificationCard;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    @Override
    public String toString() {
        return "Person: " +
                "name: " + name +
                ", identificationCard: " + identificationCard +
                "Address: " + address;

    }
}
