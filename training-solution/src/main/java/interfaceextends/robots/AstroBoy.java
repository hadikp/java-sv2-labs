package interfaceextends.robots;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot {

    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();
    private static final long ALTITUDE = 5; //magasság

    public AstroBoy(Point position) {
        this.position = position;
    }

    public void flyTo(Point position) {
        System.out.println();
    }

    @Override
    public void liftTo(long altitude) {

    }

    @Override
    public void moveTo(Point position) {
        walkTo(position);
    }

    @Override
    public void fastMoveTo(Point position) {

    }

    @Override
    public void rotate(int angle) {
        this.angle = angle;

    }

    @Override
    public List<Point> getPath() {
        return path;
    }

    private void walkTo(Point position) {
        this.position = position;
        path.add(position);
    }
}
