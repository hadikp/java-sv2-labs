package finalmodifier;

public class CilinderCalculator {
    public double calculateVolume(double r, double h) {
        return r * r * CircleCalculator.PI * h;
    }

    public double calculateSurfaceArea(double r, double h) {
        return 2 * r * CircleCalculator.PI * h;
    }
}
