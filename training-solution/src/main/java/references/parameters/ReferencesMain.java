package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person person1 = new Person("Péter", 50);
        Person person2 = person1;
        System.out.println("person1 " + person1.getName());
        System.out.println("person2 " + person2.getName());
        person2.setName("János");
        System.out.println("person2 nevének módosítása után");
        System.out.println("person1 " + person1.getName());
        System.out.println("person2 " + person2.getName());

        System.out.println();
        int elso = 24;
        int masodik = elso;
        System.out.println(elso + " " + masodik);
        masodik += 1;
        System.out.println(elso + " " + masodik);

        //Person person2 = new Person("János", 33);

    }
}
