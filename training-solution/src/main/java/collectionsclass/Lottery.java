package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {

    private int lotteryType; //5-ös, 6-os
    private int ballCount; //golyók száma

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        if (ballCount <= lotteryType) {
            throw new IllegalArgumentException("Rossz paramétereket adtál meg!");
        }
        Random rnd = new Random();
        List<Integer> result = new ArrayList<>();
        while (result.size() != lotteryType) {
            int number = rnd.nextInt(1, ballCount);
            if (!result.contains(number)) {
                result.add(number);
            }
        }
        Collections.sort(result);
        return result;
    }
}
