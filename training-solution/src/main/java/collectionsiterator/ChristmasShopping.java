package collectionsiterator;

import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {

    List<ChristmasPresent> presents;

    public ChristmasShopping(List<ChristmasPresent> presents) {
        this.presents = presents;
    }

    public void addNewPresent(ChristmasPresent present) {
        presents.add(present);
    }

    public List<ChristmasPresent> getPresents() {
        return presents;
    }

    public void removeTooExpensivePresent(int maxPrice) {
        Iterator<ChristmasPresent> iterator = presents.iterator();
        while (iterator.hasNext()) {
            ChristmasPresent presi = iterator.next();
            if (presi.getPrice() > maxPrice) {
                iterator.remove();
            }
        }
    }
}
