package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl intro = new IntroControl();
        System.out.println(intro.subtractTenIfGreaterThanTen(12));
        System.out.println(intro.describeNumber(0));
        System.out.println(intro.greetingToJoe("Joe"));
        System.out.println(intro.calculateBonus(10000));
        System.out.println("A mérőóraállások közötti különbség: " + intro.calculateConsumption(5000,9990)); //villanyóra
        System.out.println("A mérőóraállások közötti különbség: " + intro.calculateConsumption(5000,200)); //villanyóra átfordul
        intro.printNumbers(11);
        intro.printNumbersBetween(0, 9);
        intro.printNumbersBetweenAnyDirection(7, 1);
        intro.printOddNumbers(11);
    }
}
