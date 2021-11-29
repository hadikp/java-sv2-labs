package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ArcherTest {

    @Test
    void testGetDamage() {
        Point point = new Point(2, 3);
        Random rnd = new Random();
        Archer archer = new Archer(point, 100, rnd);

    }

}