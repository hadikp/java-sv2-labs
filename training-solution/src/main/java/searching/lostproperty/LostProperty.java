package searching.lostproperty;

import java.time.LocalDate;
import java.util.Objects;

public class LostProperty implements Comparable<LostProperty>  {

    private String registrationNumber;
    private String description;
    private LocalDate date;

    public LostProperty(String description, LocalDate date) {
        this.description = description;
        this.date = date;
    }

    public LostProperty(String registrationNumber, String description, LocalDate date) {
        this.registrationNumber = registrationNumber;
        this.description = description;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LostProperty that = (LostProperty) o;
        return Objects.equals(description, that.description) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, date);
    }

    @Override
    public int compareTo(LostProperty lost) {
        if (description.compareTo(lost.description) == 0) {
            return date.compareTo(lost.date);
        } else {
            return description.compareTo(lost.description);
        }
    }

    @Override
    public String toString() {
        return registrationNumber + " description=" + description + " " + date;
    }
}
