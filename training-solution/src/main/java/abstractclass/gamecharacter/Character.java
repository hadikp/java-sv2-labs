package abstractclass.gamecharacter;

import java.util.Random;

public abstract   class Character {

    private Point position;
    private int hitPoint; //életerő
    protected Random random;

    public Character(Point position, int hitPoint, Random random) {
        this.position = position;
        this.hitPoint = hitPoint;
        this.random = new Random();
    }

    public boolean isAlive() { //Még él a karakter?
        return hitPoint > 0;
    }

    protected int getActualPrimaryDamage() {
        return random.nextInt(10) + 1;
    }

    private int getActualDefence() { //aktuális védelem
        return random.nextInt(5) + 1;
    }

    protected void hit(Character enemy, int damage) {
        if (getActualDefence() < damage) {
            decreaseHitPoint(damage);
        }
    }

    private void decreaseHitPoint(int diff) {
        hitPoint -= diff;
    }

    public void primaryAttack(Character enemy) {
        hit(enemy, getActualPrimaryDamage());
    }

    public abstract void secondaryAttack(Character enemy);

    public Point getPosition() {
        return position;
    }
}
