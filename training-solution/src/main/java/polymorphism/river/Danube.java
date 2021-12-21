package polymorphism.river;

import java.util.ArrayList;
import java.util.List;

public class Danube extends River {

    private List<String> capitals; //Azon fővárosok listálya ahol keresztülfolyik

    public Danube(String name, int length, List<String> capitals) {
        super(name, length);
        this.capitals = capitals;
    }

    public List<String> getCapitals() {
        return new ArrayList<>(capitals);
    }

    public static void main(String[] args) {
        Water water = new Danube("Duna", 1350, List.of("Bécs", "Budapest", "Bukarest"));
        River river = new Danube("Tisza", 962, List.of("Tiszacsécse", "Szeged"));
        Danube danube = new Danube("Amazonas", 6850, List.of("Barcelus", "Manaus", "Santarem"));

        System.out.println(water.toString());
        System.out.println(river.getName());
        System.out.println(river.getLength());
        System.out.println();
        System.out.println(danube.getName());
        System.out.println(danube.getLength());
        System.out.println(danube.getCapitals());
    }
}
