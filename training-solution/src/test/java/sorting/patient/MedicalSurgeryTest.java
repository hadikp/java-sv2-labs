package sorting.patient;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MedicalSurgeryTest {

    Patient peter;
    Patient janos;
    Patient eniko;
    List<Patient> patients;

    @BeforeEach
    void init() {
        eniko = new Patient("Enikő", "856-433", LocalTime.of(10, 50));
        peter = new Patient("Péter", "456-433", LocalTime.of(8, 10));
        janos = new Patient("János", "956-433", LocalTime.of(7, 30));

         patients = Arrays.asList(eniko, peter, janos);
    }

    @Test
    void testOrderList() {
        MedicalSurgery medicalSurgery = new MedicalSurgery(patients);
        System.out.println(medicalSurgery.getPatientsInTimeOrder());
        System.out.println(medicalSurgery.getPatients());
    }

}