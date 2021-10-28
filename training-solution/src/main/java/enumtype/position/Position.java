package enumtype.position;

public enum Position {
    TAKARÍTÓNŐ(122000, "ingyen mosópor"), TITKÁRNŐ(222000, "plusz Wc papír"), IGAZGATÓ(1233000, "plusz titkárnő");

    private final int salary;
    private final String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
