package primitivetypes.exam;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate yearOfBirth;
    private int zipcode;
    private double average; //osztáyzatok átlaga

    public Person(String name, LocalDate yearOfBirth, int zipcode, double average) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.zipcode = zipcode;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    public int getZipcode() {
        return zipcode;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "Név: " + name +
                ", Születési idő: " + yearOfBirth +
                ", Irányítószám: " + zipcode +
                ", Osztzályzatok átlaga: " + average;
    }
}
