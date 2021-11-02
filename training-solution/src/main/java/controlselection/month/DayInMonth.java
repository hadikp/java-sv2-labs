package controlselection.month;

public class DayInMonth {
    public int monthDayNum (String month) {
        String monthLower = month.toLowerCase();
        int numOfDay;
        switch (monthLower) {
            case "január":
                numOfDay = 31;
                break;
            case "február":
                numOfDay = 28;
                break;
            case "március":
                numOfDay = 31;
                break;
            case "április":
                numOfDay = 30;
                break;
            case "május":
                numOfDay = 31;
                break;
            case "június":
                numOfDay = 30;
                break;
            case "július":
                numOfDay = 31;
                break;
            case "augusztus":
                numOfDay = 31;
                break;
            case "szeptember":
                numOfDay = 30;
                break;
            case "október":
                numOfDay = 31;
                break;
            case "november":
                numOfDay = 30;
                break;
            case "december":
                numOfDay = 31;
                break;
            default:
                System.out.println("Nincs ilyen hónap");
                numOfDay = 0;
        }
        return numOfDay;
    }

    public static void main(String[] args) {
        DayInMonth dim = new DayInMonth();
        System.out.println( dim.monthDayNum("december"));

    }
}
