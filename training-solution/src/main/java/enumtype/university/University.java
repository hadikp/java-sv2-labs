package enumtype.university;

public enum University {
    BME("Budapesti Műszaki Egyetem"), PE("Pannon Egyetem"), ME("Miskolci Egyetem");

    private final String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
