package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private int firstHour;
    private int lastHour;
    private int everyMinute;
    private List<SimpleTime> timeTable;

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        List<SimpleTime> generatedList = new ArrayList<>();
        for (int i = firstHour; i < lastHour; i++) {
            generatedList.add(new SimpleTime(i));
            generatedList.add(new SimpleTime(i, everyMinute));
        }
        timeTable = generatedList;
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public SimpleTime getNextBus(SimpleTime actual) {
       for (SimpleTime st: timeTable) {
           if(st.getDifference(actual) >= 0) {
              return st;
           }
       }
       throw new IllegalArgumentException("Ma már több busz nem indul!");
    }
}
