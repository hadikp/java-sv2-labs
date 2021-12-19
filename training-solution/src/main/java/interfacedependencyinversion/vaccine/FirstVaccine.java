package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine {

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return new ArrayList<>(vaccinationList);
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        pregnancyAddList(registrated);
        oldAddList(registrated);
        othersAddList(registrated);
    }

    private void othersAddList(List<Person> registrated) {
        for (Person p: registrated) {
            if (p.getAge() <= 65 && p.getPregnant() == Pregnancy.NO) {
                vaccinationList.add(p);
            }
        }
    }

    private void oldAddList(List<Person> registrated) {
        for (Person p: registrated) {
            if (p.getAge() > 65) {
                vaccinationList.add(p);
            }
        }
    }

    private void pregnancyAddList(List<Person> registrated) {
        for (Person p: registrated) {
            if (p.getPregnant() == Pregnancy.YES) {
                vaccinationList.add(p);
            }
        }
    }
}
