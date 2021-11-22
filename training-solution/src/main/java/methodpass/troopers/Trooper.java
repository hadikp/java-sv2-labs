package methodpass.troopers;

public class Trooper {

    private String name;
    private Position position;

    public Trooper(String name) {
        this.name = name;
        this.position = new Position(0, 0);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public Position changePosition (Position target) {
        return this.position = target;
    }

    public double distanceFrom(Position target) {
        return position.distanceFrom(target);
    }


}
