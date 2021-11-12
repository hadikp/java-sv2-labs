package introexceptionthrow.patient;

public class Patient {
    private String name;
    private String TAJNumber;
    private int yearOfBirth;

    public Patient(String name, String TAJNumber, int yearOfBirth) {
        if (name.length() == 0) {
            throw new IllegalArgumentException("A név nem lehet üres!");
        }

        if (yearOfBirth <= 1900) {
            throw new IllegalArgumentException("Nem születhettél korábban mint 1900");
        }
        this.name = name;
        this.TAJNumber = TAJNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getTAJNumber() {
        return TAJNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
