package defaultconstructor.date;

import java.util.Arrays;
import java.util.List;

public class SimpleDate {

    private int year;
    private int month;
    private int day;

    public void setDate(int year, int month, int day) {
        if (!isCorrect(year, month, day)) {
            throw new IllegalArgumentException("Rossz adatot adtál meg!");
        } else {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    private boolean isCorrect(int year, int month, int day) {
        int monthLenght = 0;
        if (year < 1900) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        monthLenght = calculateMonthLength(year, month);
        if ( day > monthLenght) {
            return false;
        }
        return true;
    }

    private boolean isLeapYear(int year) {
      return  (year % 4 == 0) ? true : false;
    }

    public int calculateMonthLength(int year, int month) {
        List<Integer> monthLengthList = Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
        if (isLeapYear(year)) {
          if (month == 02) {
              return 29;
          }
        }
        return monthLengthList.get(month-1);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
