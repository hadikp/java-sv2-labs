package introconstructors;

import java.time.LocalDate;

public class CyclingTour {
    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, int year, int month, int day) {
        this.description = description;
        this.startTime = LocalDate.of(year, month, day);
    }

    public int registerPerson(int person) {
        return numberOfPeople += person;
    }

    public double ride(double km) {
        return kms += km;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }
}
