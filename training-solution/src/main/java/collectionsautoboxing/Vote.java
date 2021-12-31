package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> datas) {
        Map<VoteResult, Integer> result = new TreeMap<>();
        result.put(VoteResult.YES, 0);
        result.put(VoteResult.NO, 0);
        result.put(VoteResult.ABSTAIN, 0);
        for (Map.Entry me: datas.entrySet()) {
            if (VoteResult.YES.equals(me.getValue())) {
            result.put(VoteResult.YES, result.get(VoteResult.YES) + 1);
            } else if (VoteResult.NO.equals(me.getValue())) {
            result.put(VoteResult.NO, result.get(VoteResult.NO) + 1);
            } else {
            result.put(VoteResult.ABSTAIN, result.get(VoteResult.ABSTAIN) + 1);
            }
        }
        return result;
    }
}
