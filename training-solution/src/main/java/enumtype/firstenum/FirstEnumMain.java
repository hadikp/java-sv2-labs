package enumtype.firstenum;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class FirstEnumMain {
    public static void main(String[] args) {
        //Continent contA = Continent.AMERICA;
        for (Continent i: Continent.values()) {
            System.out.println(i);
        }
        Continent[] continents = Continent.values();
        System.out.println(Arrays.toString(continents));
        System.out.println();

        //Óceánok nevei
        for ( Ocean oc: Ocean.values()) {
            System.out.println(oc);
        }
        Ocean oc = Ocean.valueOf("ATLANTI");
        System.out.print(oc + " ");
        System.out.print(Ocean.valueOf("CSENDES") + " ");
        System.out.println(Ocean.valueOf("INDIAI"));
        System.out.println();

        Football Cs = Football.KAPUS;
        String nameCs = Cs.name();
        System.out.print(nameCs + " ");
        System.out.print((Football.CSATÁR).name() + " ");
        System.out.print((Football.HÁTVÉD).name() + " ");
        System.out.print((Football.KÖZÉPPÁLYÁS).name());

    }

}
