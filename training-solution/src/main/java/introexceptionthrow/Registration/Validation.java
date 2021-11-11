package introexceptionthrow.Registration;

public class Validation {

    private boolean successValidName;
    private boolean successValidAge;

    public String  validateName(String name) {
        if (name == null || name.equals("")) {
            successValidName = false;
            throw new IllegalArgumentException("A nevedben üres karakter vagy null van!");
        }
        successValidName = true;
        return name;
    }

    public void validateAge(String ageString) {
        if (ageString.length() == 0) {
            successValidAge = false;
            throw new IllegalArgumentException("Nem írtál be semmit amikor az életkorodat kérdeztem");
        }
        int ageInt = Integer.parseInt(ageString);
        if (ageInt < 0 || ageInt > 120) {
            successValidAge = false;
            throw new IllegalArgumentException("Az életkorodat nem jól írtad be!");
        }
        successValidAge = true;
    }

    public void registrationOk() {
        if (successValidName && successValidAge) {
            System.out.println("A regisztráció sikeres volt!");
        } else {
            System.out.println("A regisztráció nem volt sikeres!");
        }

    }
}
