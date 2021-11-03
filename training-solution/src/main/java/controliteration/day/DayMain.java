package controliteration.day;

public class DayMain {
    public static void main(String[] args) {
        Hour hour = new Hour(10);
        Hour hour2 = new Hour(23);
        Hour hour3 = new Hour(5);
        Day day = new Day();
        day.addHour(hour);
        day.addHour(hour2);
        day.addHour(hour3);
        day.setDayPeriod();
        System.out.println(day.getHoursOfDay());
        //day.getDayPeriod();



    }
}
