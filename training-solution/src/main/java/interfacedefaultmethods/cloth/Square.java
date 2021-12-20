package interfacedefaultmethods.cloth;

public interface Square {


    default int getNumberOfSides() {
        return 4;
    }

    default double getLengthOfDiagonal() {
        return Math.sqrt(2 * Math.pow(getSide(), 2));

    }

    default double getPerimeter() {
        return 4 * getSide();
    }

    double getSide();
}
