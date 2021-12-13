package interfacedependencyinversion.carrying;

public class CourierCompany {

    public static void main(String[] args) {
        Box smallBox = new SmallBox();
        System.out.println("Méret: " + smallBox.getSize());
        System.out.println("Ár: " + smallBox.getPrice() + " Ft");

        Box mediumBox = new MediumBox();
        System.out.println("Méret: " + mediumBox.getSize());
        System.out.println("Ár: " + mediumBox.getPrice() + " Ft");

        Box largeBox = new LargeBox();
        System.out.println("Méret: " + largeBox.getSize());
        System.out.println("Ár: " + largeBox.getPrice() + " Ft");

        Box extraLargeBox = new ExtraLargeBox();
        System.out.println("Méret: " + extraLargeBox.getSize());
        System.out.println("Ár: " + extraLargeBox.getPrice() + " Ft");
    }
}
