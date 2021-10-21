package statements;

public class Time {
    private int hour;
    private int min;
    private int second;

    public Time(int hour, int min, int second) {
        this.hour = hour;
        this.min = min;
        this.second = second;
    }

    public int getInMinutes() {

        return hour * 60 + min;
    }

    public int getInSeconds() {
        return (hour * 60 * 60) + (min * 60) + second;
    }

    public boolean earlierThan(Time time, Time time2) {

        return time.getInSeconds() < time2.getInSeconds();
    }

    @Override
    public String toString() {
        return hour + ":" + min + ":" + second;
    }
}
