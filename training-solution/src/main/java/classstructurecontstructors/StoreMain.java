package classstructurecontstructors;

public class StoreMain {
    public static void main(String[] args) {
        System.out.println("First store");
        Store depot1 = new Store("milk");
        depot1.store(22);
        System.out.println(depot1.getStock());
        depot1.dispatch(2);
        System.out.println(depot1.getStock());

        System.out.println("Second store");
        Store depot2 = new Store("beer");
        depot2.store(33);
        System.out.println(depot2.getStock());
        depot2.dispatch(10);
        System.out.println(depot2.getStock());
    }
}
