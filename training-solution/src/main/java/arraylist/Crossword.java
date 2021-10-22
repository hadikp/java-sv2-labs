package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Crossword {
    public static void main(String[] args) {
        String[] names = {"KULCS", "KÁLYHA", "LÓ", "AJTÓ", "CSERESZNYEFA", "TEJ", "FELHŐ", "CIPŐ", "MOSODA", "KÁVÉTEJSZÍN", "CITERA", "BABA"};
        List<String> words = Arrays.asList(names);
        System.out.print("Hatbetűs szavak: ");
        for (String word: words) {
            if (word.length() == 6) {
                System.out.print(word + " ");
            }
        }
    }
}
