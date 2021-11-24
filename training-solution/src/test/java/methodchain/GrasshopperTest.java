package methodchain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrasshopperTest {

    Grasshopper ghp;

    @BeforeEach
    void init () {
        ghp = new Grasshopper();
    }

    @Test
    void testHopOnce () {
        System.out.println(ghp.getPosX());
        ghp.hopOnce(Direction.POSITIVE);
        System.out.println(ghp.getPosX());
        ghp.hopOnce(Direction.NEGATIVE);
        System.out.println(ghp.getPosX());
    }

    @Test
    void testMoveFromZeroToThreeWithFiveHops () {
        ghp.moveFromZeroToThreeWithFiveHops();

    }

}