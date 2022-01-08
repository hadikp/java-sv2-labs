package collectionscomp;

import java.util.Set;
import java.util.TreeSet;

public class BuildingMain {
    public static void main(String[] args) {
        Set<Building> buildings = new TreeSet<>();
        Building building1 = new Building("Veszprém", 133, 2);
        Building building2 = new Building("Bárna", 155, 1);
        Building building3 = new Building("Székesfehérvár", 133, 5);
        buildings.add(building1);
        buildings.add(building2);
        buildings.add(building3);
        System.out.println(buildings);
    }
}
