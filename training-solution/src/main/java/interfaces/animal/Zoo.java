package interfaces.animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animalList = new ArrayList<>();

    public Zoo(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public int getNumberOfAnimal() {
        return animalList.size();
    }

    public int getNumberOfLegs() {
        int sumLegs = 0;
        for (Animal a: animalList) {
            sumLegs += a.getNumberofLegs();
        }
        return sumLegs;
    }
}
