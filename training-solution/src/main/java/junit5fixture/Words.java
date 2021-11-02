package junit5fixture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Words {
    private List<String> words = new ArrayList<>();

    public void addWord(String word) {
        words.add(word);
    }

    public void getWordsStartWith(String prefix) {
        List<String> removeList = new ArrayList<>();
        for (String st: words) {
            if (!st.startsWith(prefix)) {
                removeList.add(st);
            }
        }
        words.removeAll(removeList);
    }

    public void getWordsWithLength(int length) {
        List<String> removeList = new ArrayList<>();
        for (String st: words) {
            if (st.length() != length) {
                removeList.add(st);
            }
        }
        words.removeAll(removeList);
    }

    public List<String> getWords() {
        return words;
    }

}
