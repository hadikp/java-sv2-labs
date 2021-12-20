package interfaceextends.polygon;

public class Poligon implements Geometric {

    private double lengthOfSide;
    private int numberOfVertices;

    public Poligon(double lengthOfSide, int numberOfVertices) {
        this.lengthOfSide = lengthOfSide;
        this.numberOfVertices = numberOfVertices;
    }

    @Override
    public double getPerimeter() { //kerület
        return numberOfVertices * lengthOfSide;
    }

    @Override
    public int getNumberOfDiagonalsFromOneVertex() { //vertex: csúcs
        return numberOfVertices - 3;
    }

    @Override
    public int getNumberOfAllDiagonals() {
        return (numberOfVertices - 3) * numberOfVertices / 2;
    }

    @Override
    public double getLengthOfSide() {
        return lengthOfSide;
    }

    @Override
    public int getNumberOfVertices() {
        return numberOfVertices;
    }
}
