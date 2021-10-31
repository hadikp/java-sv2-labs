package formetlocaleprintf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Thanks {
    public static void main(String[] args) {
        List<String> names = new ArrayList(Arrays.asList("Hadik Péter", "Molnár Ákos", "Huszár Norbert"));
        for (String n: names) {
            String t = String.format("Kedves %s! %s!", n, "Örülünk, hogy termékünket választotta");
            System.out.println(t);
        }
    }
}
