package aslist;

import java.util.Arrays;
import java.util.List;

public class Island {
    public static void main(String[] args) {
        List<String> importantThings = Arrays.asList("ÉTEL", "ITAL", "LAPTOP");
        System.out.print("Ezt a három dolgot viheted magaddal a szigetre: ");
        for (String thing: importantThings) {
            System.out.print(thing + " ");
        }

        System.out.println();
        importantThings.set(0, "KUTYA");
        System.out.print("Inkább mégis ezt a három dolgot viszem magammal a szigetre: ");
        for (String thing: importantThings) {
            System.out.print(thing + " ");
        }
    }
}
