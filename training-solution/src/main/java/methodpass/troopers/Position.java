package methodpass.troopers;

public class Position {

    private final double posX;
    private final double posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double distanceFrom(Position position) {
        double x1MinusX2 = posX - position.posX;
        double y1MinusY2 = posY - position.posY;
        return Math.sqrt(Math.pow(x1MinusX2, 2) + Math.pow(y1MinusY2, 2));
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }
}
