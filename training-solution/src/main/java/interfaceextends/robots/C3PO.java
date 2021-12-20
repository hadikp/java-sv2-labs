package interfaceextends.robots;

import java.util.ArrayList;
import java.util.List;

public class C3PO implements MovableRobot {

    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();

    public C3PO(Point position) {
        this.position = position;
        path.add(position);
    }

    @Override
    public void moveTo(Point position) {
        walkTo(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        walkTo(position);
    }

    @Override
    public void rotate(int angle) {
        this.angle = angle;
    }

    @Override
    public List<Point> getPath() {
        return path;
    }

    private void walkTo(Point position) { //Beállítja a robot új pozícióját és be is jegyzi a pathba
        this.position = position;
        path.add(position);
    }

}
