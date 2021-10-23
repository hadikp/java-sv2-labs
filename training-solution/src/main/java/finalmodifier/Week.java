package finalmodifier;

import java.util.Arrays;
import java.util.List;

public class Week {
    List<String> days = Arrays.asList("Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap");

    public static void main(String[] args) {
        Week week = new Week();
        for (String day: week.days) {
            System.out.print(day + " ");
        }
        System.out.println();
        week.days.set(1, "Szerda");
        for (String day: week.days) {
            System.out.print(day + " ");        }
    }
}
