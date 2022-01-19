package lambdacomparator.cloud;

import java.util.PrimitiveIterator;

public class CloudStorage implements Comparable<CloudStorage> {

    private String provider; //szolgáltató neve
    private int space; //GB
    private double price;
    private PayPeriod payPeriod;

    public CloudStorage(String provider, int space) {
        this.provider = provider;
        this.space = space;
    }

    public CloudStorage(String provider, int space, double price, PayPeriod payPeriod) {
        this(provider, space);
        this.price = price;
        this.payPeriod = payPeriod;
    }

    @Override
    public int compareTo(CloudStorage o) {
        return 0;
    }

    public String getProvider() {
        return provider;
    }

    public int getSpace() {
        return space;
    }

    public double getPrice() {
        return price;
    }

    public PayPeriod getPayPeriod() {
        return payPeriod;
    }
}
