package collectionsclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    Lottery lottery = new Lottery();

    @Test
    void testLottory() {
        System.out.println(lottery.selectWinningNumbers(6, 45));
    }

    @Test
    void testMistake() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> lottery.selectWinningNumbers(6, 5));
        assertEquals("Rossz paramétereket adtál meg!", iae.getMessage());
    }

}