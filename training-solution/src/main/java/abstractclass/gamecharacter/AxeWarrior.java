package abstractclass.gamecharacter;

import java.util.Random;

public class AxeWarrior extends Character {

    public AxeWarrior(Point position, int hitPoint, Random random) {
        super(position, hitPoint, random);
    }

    private int getActualSecondaryDamage() {
        return random.nextInt(19) + 1;
    }

    @Override
    public Point getPosition() {
        return super.getPosition();
    }

    @Override
    public void secondaryAttack(Character enemy) {
        double x = getPosition().getX(); //AxeWarrior position
        double y = getPosition().getY();
        if (enemy.getPosition().distance(x, y) < 2) {
            hit(enemy, getActualSecondaryDamage());
        }
    }
}
