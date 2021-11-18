package algorithmsdecision.words;

import java.util.List;

public class Word {

    public boolean containsLongerWord(List<String> wordsList, String word) {
        for (String w: wordsList) {
            if (w.length() > word.length()) {
                return true;
            }
        }
        return false;
    }
}
