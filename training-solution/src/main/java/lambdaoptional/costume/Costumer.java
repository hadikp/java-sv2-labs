package lambdaoptional.costume;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Costumer {

    private List<Costume> costumes;

    public Costumer(List<Costume> costumes) {
        this.costumes = costumes;
    }

    public Optional<Costume> findFirstCostumeWithKeyWord(String keyWord) {
        return findFirst(costume -> costume.getDescription().contains(keyWord));
    }

    public Optional<Costume> findFirstCheaperCostume(int maxPrice) {
        return findFirst(costume -> costume.getPrice() < maxPrice);
    }

    public Optional<Costume> findFirstCostumeSameSize(Size size) {
        return findFirst(costume -> costume.getSize() == size);
    }

    private Optional<Costume> findFirst(Predicate<Costume> condition) {
        for (Costume c: costumes) {
            if (condition.test(c)) {
                return Optional.of(c);
            }
        }
        return Optional.empty();
    }

    public List<Costume> getCostumes() {
        return costumes;
    }
}
