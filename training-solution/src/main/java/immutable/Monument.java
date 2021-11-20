package immutable;

public class Monument {
    private final String name;
    private final String address;
    private final String dateOfRegistry;
    private final String numberOfRegistry;

    public Monument(String name, String address, String dateOfRegistry, String numberOfRegistry) {
        if (isEmpty(name) || isEmpty(address) || isEmpty(dateOfRegistry) || isEmpty(numberOfRegistry)) {
            throw new IllegalArgumentException("A nevet és a többi adatot is meg kell adnod!");
        }
        this.name = name;
        this.address = address;
        this.dateOfRegistry = dateOfRegistry;
        this.numberOfRegistry = numberOfRegistry;
    }

    private boolean isEmpty(String text) {
        return text == null || text == "";
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDateOfRegistry() {
        return dateOfRegistry;
    }

    public String getNumberOfRegistry() {
        return numberOfRegistry;
    }
}
