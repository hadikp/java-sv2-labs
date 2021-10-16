package classstructurecontstructors;

public class Store {
    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
    }

    public int store(int stk){
        return stock += stk;
    }

    public int dispatch(int stk){
        return stock -= stk;
    }

    public int getStock() {
        return stock;
    }
}
