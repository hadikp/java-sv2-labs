package exceptionclass.course;

public class SimpleTime {

    private int hours;
    private int minutes;
    private String time;

    public SimpleTime(int hours, int minutes) {
        isHoursValid(hours);
        isMinutesValid(minutes);
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(String time) {
        isTimeNull(time);
        isTimeFormatValid(time);
        this.time = time;
        String[] timeSplit = time.split(":");
        int hoursTimesplit = Integer.parseInt(timeSplit[0]);
        int minutesTimesplit = Integer.parseInt(timeSplit[1]);
        isHoursValid(hoursTimesplit);
        isMinutesValid(minutesTimesplit);
        this.hours = hoursTimesplit;
        this.minutes = minutesTimesplit;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    @Override
    public String toString() {
        return hours +":" + minutes;
    }

    private void isMinutesValid(int minutes) {
        if (minutes < 0 || minutes > 59) {
            throw new InvalideTimeException("Minute is invalid (0-59)");
        }
    }

    private void isHoursValid(int hours) {
        if (hours < 0 || hours > 23) {
            throw new InvalideTimeException("Hour is invalid (0-23)");
        }
    }

    private void isTimeFormatValid(String time) {
        if (!time.contains(":")) {
            throw new InvalideTimeException("Time is not hh:mm");
        }
    }

    private void isTimeNull(String time) {
        if (time == null) {
            throw new InvalideTimeException("Time cant null!");
        }
    }
}
