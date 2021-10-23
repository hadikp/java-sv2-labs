package finalmodifier;

public class PiMain {
    public static void main(String[] args) {

        CircleCalculator calc = new CircleCalculator();
        System.out.println(calc.calculatePerimeter(2));
        System.out.println(calc.calculateArea(3));
        System.out.println(CircleCalculator.PI);

        System.out.println();
        CilinderCalculator cilinderCalc = new CilinderCalculator();
        System.out.println(cilinderCalc.calculateSurfaceArea(2, 3));
        System.out.println(cilinderCalc.calculateVolume(3, 3));
        System.out.println();

        CylinderCalculatorBasedOnCircle calcSum = new CylinderCalculatorBasedOnCircle();
        System.out.println(calcSum.calculateSurfaceArea(2, 3));
        System.out.println(calcSum.calculateVolume(3, 3));


    }
}
