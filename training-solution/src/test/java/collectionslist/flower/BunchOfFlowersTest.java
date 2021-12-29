package collectionslist.flower;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BunchOfFlowersTest {

    @Test
    void testAddFlowerInTheMiddle() {
        BunchOfFlowers bf = new BunchOfFlowers();
        bf.addFlower("fl");
        bf.addFlower("fl");
        bf.addFlower("fl");

        bf.addFlowerInTheMiddle("flower");
        System.out.println(bf.getFlowers());

    }

}