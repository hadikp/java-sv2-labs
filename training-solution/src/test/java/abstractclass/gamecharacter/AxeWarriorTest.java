package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class AxeWarriorTest {

    @Test
    void test() {
        Point pointAxe = new Point(8, 6);
        Point pointArc = new Point(2, 3);
        Random rnd = new Random();
        Archer archer = new Archer(pointArc, 100, rnd);
        AxeWarrior axeWarrior = new AxeWarrior(pointAxe, 100, rnd);
        axeWarrior.secondaryAttack(archer);
    }

}