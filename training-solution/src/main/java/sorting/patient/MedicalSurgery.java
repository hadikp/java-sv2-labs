package sorting.patient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedicalSurgery {

    private List<Patient> patients;

    public MedicalSurgery(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Patient> getPatientsInTimeOrder() {
        List<Patient> patientsNew = new ArrayList<>(patients);
        Collections.sort(patientsNew, new PatientComparator());
        return patientsNew;
    }

    public List<Patient> getPatients() {
        return new ArrayList<>(patients);
    }
}
