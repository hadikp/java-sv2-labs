package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BattleFieldTest {

    @Test
    void testOneHit() {
        Point pointAxe = new Point(3, 8);
        Point pointArc = new Point(2, 3);
        Random rnd = new Random();
        Archer archer = new Archer(pointArc, 50, rnd);
        AxeWarrior axeWarrior = new AxeWarrior(pointAxe, 50, rnd);
        BattleField battleField = new BattleField();
        System.out.println(battleField.fight(axeWarrior, archer));
        System.out.println("Körök száma: " + battleField.getRound());

    }

}