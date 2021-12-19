package interfacedependencyinversion.vaccine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VaccineTest {

    List<Person> vaccinationList;
    Vaccine vaccine;

    @BeforeEach
    void init() {
        vaccinationList = new ArrayList<>();
        Person personMan = new Person("Péter", 33, ChronicDisease.NO, Pregnancy.NO);
        Person personOldMan = new Person("János", 66, ChronicDisease.NO, Pregnancy.NO);
        Person personOldMan2 = new Person("Elek", 68, ChronicDisease.YES, Pregnancy.NO);
        Person personWomen = new Person("Ilus", 44, ChronicDisease.NO, Pregnancy.YES);
        Person personWomen2 = new Person("Enikő", 64, ChronicDisease.NO, Pregnancy.NO);
        vaccinationList.add(personMan);
        vaccinationList.add(personOldMan);
        vaccinationList.add(personOldMan2);
        vaccinationList.add(personWomen);
        vaccinationList.add(personWomen2);
    }

    @Test
    void testFirstVaccine() {
        vaccine = new FirstVaccine();
        vaccine.generateVaccinationList(vaccinationList);
        assertEquals("Ilus", vaccine.getVaccinationList().get(0).getName());
        assertEquals("János", vaccine.getVaccinationList().get(1).getName());
    }

    @Test
    void testSecondVaccine() {
        vaccine = new SecondVaccine();
        vaccine.generateVaccinationList(vaccinationList);
        assertEquals("Péter", vaccine.getVaccinationList().get(0).getName());
        assertEquals("Enikő", vaccine.getVaccinationList().get(1).getName());
        assertEquals("János", vaccine.getVaccinationList().get(2).getName());
    }

}