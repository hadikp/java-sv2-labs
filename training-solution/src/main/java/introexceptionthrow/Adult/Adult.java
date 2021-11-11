package introexceptionthrow.Adult;

public class Adult {
    private String name;
    private int age;

    public Adult(String name, int age) {
        this.name = name;
        this.age = age;
        if (age < 18) {
            throw new IllegalArgumentException("18 év alatt van az életkorod!");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
