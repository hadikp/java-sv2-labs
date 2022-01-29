package lambda;

import java.util.List;

public class TreeNursery {

    private List<Sapling> saplings;

    public TreeNursery(List<Sapling> saplings) {
        this.saplings = saplings;
    }

    public void prune(int maxHeight) {
        saplings.forEach(s -> s.cut(maxHeight));
    }

    public void sell(String species, int minHeight) {
        saplings.removeIf(f -> f.getSpecies().equals(species) && f.getHeight() > minHeight);
    }


}
