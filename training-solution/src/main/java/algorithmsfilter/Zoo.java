package algorithmsfilter;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animalList;

    public Zoo(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public List<Animal> getAnimalsWithNumberOfLegsGiven(int numberOfLegs) {
        List<Animal> animalNumOfLegs = new ArrayList<>();
        for (Animal al: animalList) {
            if (al.getNumberOfLegs() == numberOfLegs) {
                animalNumOfLegs.add(al);
            }
        }
        return animalNumOfLegs;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }
}
