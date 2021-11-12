package introexceptionthrow.patient;

public class PatientMain {
    public static void main(String[] args) {
        Patient patientA = new Patient("János", "064853594", 1988);
        Patient patientP = new Patient("Péter", "030377215", 1988);
        SsnValidator ssnValidator = new SsnValidator();
        try {
            ssnValidator.isValidTAJ("064853594");


        }
        catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
        System.out.println("A vezérlés a program végéig eljutott");
    }
}
