package algorithmsmax.temperature;

import java.util.List;

public class Temperature {
    public int getMin(List<Integer> temperatureList) {
        int min = temperatureList.get(0);
        for (int i: temperatureList) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
