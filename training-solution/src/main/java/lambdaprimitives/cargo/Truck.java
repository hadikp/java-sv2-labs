package lambdaprimitives.cargo;

import java.util.IntSummaryStatistics;
import java.util.List;

public class Truck {

    private List<Cargo> thingsToLoad;

    public Truck(List<Cargo> thingsToLoad) {
        this.thingsToLoad = thingsToLoad;
    }

    public double getShortestLength() {
        return thingsToLoad.stream().mapToDouble(Cargo::getLength).min().getAsDouble();
    }

    public int getTotalWeight() {
        return thingsToLoad.stream().mapToInt(Cargo::getWeight).sum();
    }

    public double getAverageWeight() {
        if (thingsToLoad.size() == 0) {
            throw new IllegalArgumentException("No cargo.");
        }
        return thingsToLoad.stream().mapToDouble(Cargo::getWeight).average().getAsDouble();
    }

    public int getMaxWeight() {
        return thingsToLoad.stream().mapToInt(Cargo::getWeight).max().getAsInt();
    }

    public String getWeightStatistics() {
        IntSummaryStatistics stat = thingsToLoad.stream().mapToInt(Cargo::getWeight).summaryStatistics();
        long count = stat.getCount();
        long sum = stat.getSum();
        int max = stat.getMax();

        if (count == 0) {
            return "No cargo.";
        }

        String write = String.format("A rakományban található %d tétel, melyeknek összsúlya %d kg," +
                " közülük a legnehezebb %d kg, a legkönnyebb %d kg. A súlyuk átlagosan %f kg.", count, sum, max, stat.getMin(), stat.getAverage());
        return write;
    }
}
