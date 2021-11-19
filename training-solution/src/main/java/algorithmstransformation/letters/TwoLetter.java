package algorithmstransformation.letters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoLetter {

    public List<String> getFirstTwoLetters(List<String> words) {
        List<String> letters = new ArrayList<>();
        for (String st: words) {
            String[] wordsSplit = st.split("");
            String twoLetters = String.format("%s%s",wordsSplit[0], wordsSplit[1]);
            letters.add(twoLetters);
        }
        return letters;
    }

    public static void main(String[] args) {
        TwoLetter letter = new TwoLetter();
        List<String> words = Arrays.asList("Kép", "Kefe", "Lista", "András");
        letter.getFirstTwoLetters(words);
    }
}
