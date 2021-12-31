package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Paper {

    private Map<String, Integer> papersKg = new HashMap<>();

    public void putFurtherPaper(String className, int kilogramms) {
        if (!papersKg.containsKey(className)) {
            papersKg.put(className, kilogramms);
        } else {
            papersKg.put(className, papersKg.get(className) + kilogramms);
        }
    }

    public String getWinnerClass() {
        int max = 0;
        String key = "";
        for (Map.Entry mp: papersKg.entrySet()) {
            if ((int) mp.getValue() > max) {
                max = (int) mp.getValue();
                key = (String) mp.getKey();
            }
        }
        return key;
    }

    public int getTotalWeight() {
        int sum = 0;
        for (int i: papersKg.values()) {
            sum += i;
        }
        return sum;
    }

    public Map<String, Integer> getPapersKg() {
        return papersKg;
    }
}
