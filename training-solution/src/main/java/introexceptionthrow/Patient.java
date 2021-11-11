package introexceptionthrow;

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

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", TAJNumber='" + TAJNumber + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public static void main(String[] args) {
        Patient patient = new Patient("Péter", "098-345-455", 1971);
        System.out.println(patient);
        Patient anotherPatient = new Patient("p", "098-345-455", 1899);
        System.out.println(anotherPatient);
    }
}
