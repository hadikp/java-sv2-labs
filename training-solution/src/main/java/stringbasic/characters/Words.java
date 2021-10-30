package stringbasic.characters;

import java.util.ArrayList;
import java.util.List;

public class Words {
    private String printW ="";
    private List<String> wordList = new ArrayList<>();

    public void makeWordSpelling (String wordChar) {
        wordList.add(wordChar);
    }

    public void printWord() {
        for (String w: wordList) {
           printW += w;
        }
        System.out.println(printW);
    }

    public boolean areEqual(String word) {
        return printW.equals(word) ? true : false;
    }

    public List<String> getWordList() {
        return wordList;
    }

}
