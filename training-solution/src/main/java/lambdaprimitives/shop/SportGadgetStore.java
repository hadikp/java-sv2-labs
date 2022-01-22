package lambdaprimitives.shop;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class SportGadgetStore {

    private List<Product> products;

    public SportGadgetStore(List<Product> products) {
        this.products = products;
    }

    public long getNumberOfProducts() {
        return products.stream().count();
    }

    public double getAveragePrice() {
        return products.stream().mapToDouble(Product::getPrice).summaryStatistics().getAverage();
    }

    public String  getExpensiveProductStatistics(double minPrice) {
        IntSummaryStatistics stat = products.stream().filter(f -> f.getPrice() > minPrice).mapToInt(Product::getDb).summaryStatistics();
        long count = stat.getCount();
        int min = stat.getMin();
        int max = stat.getMax();
        long sum = stat.getSum();
        if (count == 0) {
            return "Nincs ilyen termék";
        }
        String write = String.format("Összesen %d féle termék, amelyekből minimum %d db, maximum %d db, összesen %d db van.", count,min, max, sum);
        return write;
    }
}
