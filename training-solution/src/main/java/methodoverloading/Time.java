package methodoverloading;

import java.time.LocalTime;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public boolean isEqual(Time time) {
        if (makeSeconds() == time.makeSeconds()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEqual(int hours, int minutes, int seconds) {
        int sec = 3600 * hours + 60 * minutes + seconds;
        if (makeSeconds() == sec) {
            return true;
        } else {
            return false;
        }

    }

    public int makeSeconds() {
        return 60 * 60 * hours + 60 * minutes + seconds;
    }


    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
