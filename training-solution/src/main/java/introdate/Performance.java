package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class Performance {
    private LocalDate date = LocalDate.of(1989, 06, 02);
    private String artist = "Queen";
    private LocalTime startTime = LocalTime.of(18, 00);
    private LocalTime endTime = LocalTime.of(20, 30);

    @Override
    public String toString() {
        return "Performance{" +
                "date=" + date +
                ", artist='" + artist + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public String getInfo() {
        return '"' + artist + ": " + date + " " + " " + startTime +" - " + endTime + '"';
    }

    public LocalDate getDate() {
        return date;
    }

    public String getArtist() {
        return artist;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

}
