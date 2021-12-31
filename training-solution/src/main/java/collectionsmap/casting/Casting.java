package collectionsmap.casting;

import java.util.Map;

public class Casting {

    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants) {
        int min = 10000;
        int keyEnd = 0;
        for (Map.Entry me: applicants.entrySet()) {
            int key = (int) me.getKey();
            if (Math.abs(lastNumber - key) < min) {
                min = Math.abs(lastNumber - key);
                keyEnd = key;
            }
        }
        return applicants.get(keyEnd);
    }
}
