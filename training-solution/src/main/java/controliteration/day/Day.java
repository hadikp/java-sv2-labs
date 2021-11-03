package controliteration.day;

import java.util.ArrayList;
import java.util.List;

public class Day {
    List<Hour> hoursOfDay = new ArrayList<>();

    public void addHour(Hour hour) {
        hoursOfDay.add(hour);
    }

   public void setDayPeriod() {
        for (Hour h: hoursOfDay) {
            if (h.getHourNumber() > 6 && h.getHourNumber() < 22) {
                h.setPeriod(DayPeriod.DAYTIME);
            } else {
                h.setPeriod(DayPeriod.NIGHTTIME);
            }
        }
    }

    //Testeléshez
    /*public void getDayPeriod() {
        for (Hour h: hoursOfDay) {
            System.out.println(h.getPeriod());
        }
    }*/


    public List<Hour> getHoursOfDay() {
        return hoursOfDay;
    }
}
