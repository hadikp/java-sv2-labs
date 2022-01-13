package collectionsequalshash.person;

public class Main {

    public static void main(String[] args) {
        Person peter = new Person("Péter", 50, "337001");
        Person janos = new Person("János", 45, "337001");
        System.out.println(peter.equals(janos));
        System.out.println(peter.hashCode());
        System.out.println(janos.hashCode());
    }
}
