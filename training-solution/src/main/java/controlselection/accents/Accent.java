package controlselection.accents;

public enum Accent {
    Á('a'), É('e'), Í('i'), Ó('o'), Ú('u');


    private final char small;

    Accent(char small) {
        this.small = small;
    }

    public char getSmall() {
        return small;
    }
}
