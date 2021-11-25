package constructoroverloading.bus;

public class SimpleTime {

    private int hours;
    private int minutes;
    private SimpleTime time;

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(int hours) {
        this.hours = hours;
    }

    public SimpleTime(SimpleTime time) {
        this.time = time;
    }

    public int getDifference(SimpleTime time) {
       int thisMinutes = 60 * hours + minutes;
       int minutes = 60 * time.hours + time.minutes;
       return thisMinutes - minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    @Override
    public String toString() {
        return "SimpleTime: " +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", time=" + time;
    }
}
