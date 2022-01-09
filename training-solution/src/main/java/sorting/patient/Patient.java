package sorting.patient;

import java.time.LocalTime;

public class Patient {

    private String name;
    private String TAJNumber;
    private LocalTime time;

    public Patient(String name, String TAJNumber, LocalTime time) {
        this.name = name;
        this.TAJNumber = TAJNumber;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getTAJNumber() {
        return TAJNumber;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return name + '\'' +
                ", TAJNumber='" + TAJNumber + '\'' +
                ", time=" + time +
                '}';
    }
}
