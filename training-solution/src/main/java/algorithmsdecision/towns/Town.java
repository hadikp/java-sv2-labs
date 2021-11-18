package algorithmsdecision.towns;

import java.util.List;

public class Town {
    public boolean containsFewerHabitants(List<Integer> townList, int upperLimit) {
        for (int i: townList) {
            if (i < upperLimit) {
                return true;
            }
        }
        return false;
    }
}
