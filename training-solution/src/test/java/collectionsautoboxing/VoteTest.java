package collectionsautoboxing;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class VoteTest {

    @Test
    void test() {
        Vote vote = new Vote();
        Map<String, VoteResult> datas = new HashMap<>();
        datas.put("John Doe", VoteResult.YES);
        datas.put("Jane Doe", VoteResult.NO);
        datas.put("Jack Doe", VoteResult.ABSTAIN);
        datas.put("Mekk Elek", VoteResult.YES);
        System.out.println(vote.getResult(datas));
    }

}