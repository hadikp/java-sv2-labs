package inheritanceattributes;

public class BuildingMain {

    public static void main(String[] args) {
        Building building = new Building("Épület", 123, 4);
        SchoolBuilding schoolBuilding = new SchoolBuilding("Iskola", 110, 2, 12);

        System.out.println("Neve: " + building.name + ", Területe: " + building.area + " Emelet: " + building.getFloors());
        System.out.println("Neve: " + schoolBuilding.name + ", Területe: " + schoolBuilding.area +
                " Emelet: " + schoolBuilding.getFloors() + " Osztályok: " + schoolBuilding.getNumberOfClassRooms());
    }
}
