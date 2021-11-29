package abstractclass.gamecharacter;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(double posX, double posY) {
        return Math.sqrt(Math.pow((y - posY), 2) + Math.pow((posX - x), 2)); //Pithagorasz tétel
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
