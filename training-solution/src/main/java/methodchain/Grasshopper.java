package methodchain;

public class Grasshopper {

    private int posX;
    private Direction direction;

    public Grasshopper() {
        this.posX = 0;
    }

    public Grasshopper hopOnce(Direction direction) {
        if (Direction.POSITIVE == direction) {
            posX++;
            System.out.println("poz");
        } else {
            posX--;
        }
        return this;
    }

    public void moveFromZeroToThreeWithFiveHops() {
        Grasshopper grp = new Grasshopper()
                .hopOnce(Direction.POSITIVE)
                .hopOnce(Direction.POSITIVE)
                .hopOnce(Direction.NEGATIVE)
                .hopOnce(Direction.POSITIVE)
                .hopOnce(Direction.POSITIVE);
        System.out.println(grp); //grp = 3
    }

    public int getPosX() {
        return posX;
    }

    @Override
    public String toString() {
        return  " posX: " + posX;
    }
}
