package introexceptiontrace.aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<Fish> ornamentalFish = new ArrayList<>(); //hiányos a Lista létrehozása

    public List<Fish> getOrnamentalFish() {
        return ornamentalFish;
    }

    public void addFish(Fish fish) {
        ornamentalFish.add(fish);
    }

    public int getNumberOfFish() {
        return ornamentalFish.size();
    }

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        Fish csuka = new Fish("csuka", "zöld");
        Fish keszeg = new Fish("keszeg", "piros");
        Fish angolna = new Fish("angolna", "fekete");

        aquarium.addFish(csuka);
        aquarium.addFish(keszeg);
        aquarium.addFish(angolna);

        System.out.println(aquarium.getNumberOfFish());

    }
}
