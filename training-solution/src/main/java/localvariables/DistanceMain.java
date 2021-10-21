package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(33.55, true);
        System.out.println("The distance: " + distance.getDistanceKm());
        System.out.println("This is: " + distance.isExact());

        int b = (int) distance.getDistanceKm();
        System.out.println(b);
    }
}
