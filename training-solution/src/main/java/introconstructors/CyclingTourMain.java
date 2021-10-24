package introconstructors;

public class CyclingTourMain {
    public static void main(String[] args) {
        CyclingTour tour = new CyclingTour("Biciglitúra", 2021, 10, 21);

        System.out.println("A túra leírása: " + tour.getDescription());
        System.out.println("A túra kezdete:" + tour.getStartTime());
        System.out.println("A jelentkezők száma: " + tour.getNumberOfPeople());
        System.out.println("A megtett kilométerek: " + tour.getKms());

        System.out.println();
        tour.registerPerson(11);
        System.out.println("A jelentkezők száma: " + tour.getNumberOfPeople());
        tour.registerPerson(10);
        System.out.println("A jelentkezők száma: " + tour.getNumberOfPeople());
        tour.ride(55);
        System.out.println("A megtett kilométerek: " + tour.getKms() + " km");
        tour.ride(55);
        System.out.println("A megtett kilométerek: " + tour.getKms() + " km");

    }
}
