package introinheritance.coffee;

public class CoffeMain {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setName("fekete kávé");
        coffee.setPrice(300);
        System.out.println(coffee.getName());
        System.out.println(coffee.getPrice());

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("Fehér cappucino");
        cappuccino.setPrice(400);
        System.out.println(cappuccino.getName());
        System.out.println(cappuccino.getPrice());
    }
}
