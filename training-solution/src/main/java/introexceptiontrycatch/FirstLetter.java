package introexceptiontrycatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLetter {

    public static void main(String[] args) {
        List<String> words = new ArrayList(Arrays.asList("szó", "Kata", "egér", "búza"));
        try {
            for (String c : words) {
                System.out.println(c.charAt(0)); //catch ághoz charAt-et rossz indexre állítani
            }
        }
        catch (StringIndexOutOfBoundsException abe) {
                System.out.println("Ilyen index nem szerepel a listában!");
            }
    }
}
