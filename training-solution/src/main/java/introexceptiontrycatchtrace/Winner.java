package introexceptiontrycatchtrace;

import java.util.*;

public class Winner {
    private List<String> peopleList = new ArrayList<>(Arrays.asList("Péter", "János", null, "Éva"));

    public String  getWinner() {
        Random rnd = new Random();
        int numberOfWin = rnd.nextInt(4);
        return peopleList.get(numberOfWin).toUpperCase();
    }
}
