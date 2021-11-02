package controlselection.week;

public class DayOfWeeks {
    public String dayWeek (String day) {
        String dayLower = day.toLowerCase();
        String typeOfDay;
        switch (dayLower) {
            case "hétfő":
                typeOfDay = "Hét eleje van";
                break;
            case "kedd":
            case "szerda":
            case "csütörtök":
                typeOfDay = "Hét közepe van";
                break;
            case "péntek":
                typeOfDay = "majdnem hétvége van";
                break;
            case "szombat":
            case "vasárnap":
                typeOfDay = "Hét vége van";
                break;
            default:
                typeOfDay = "ismeretlen nap";
        }
        return typeOfDay;
    }

    public static void main(String[] args) {
        DayOfWeeks dayOfWeeks = new DayOfWeeks();
        System.out.println(dayOfWeeks.dayWeek("sZombat"));
    }

}
