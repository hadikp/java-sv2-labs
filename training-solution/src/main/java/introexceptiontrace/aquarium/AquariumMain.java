package introexceptiontrace.aquarium;

public class AquariumMain {
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
