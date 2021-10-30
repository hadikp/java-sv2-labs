package stringbasic.characters;

import java.util.Scanner;

public class WordsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tanárbácsi kérem a szót!");
        String word = sc.nextLine();
        System.out.println("Ezt a szót kell lebetűznöd: " + word);
        Words wordSpelling = new Words();

        System.out.println("Kérlek írd be a szó betűit egyenként!");
        for (int i = 0; i < word.length(); i++) {
            String wordChar = sc.nextLine();
            wordSpelling.makeWordSpelling(wordChar);
        }

        System.out.println("Az előbb ezeket a betűket írtad be a konzolra: " + wordSpelling.getWordList());
        System.out.print("Ezekből a betűkből ez a szó írható ki: ");
        wordSpelling.printWord();
        System.out.println("A tanuló a feladatot jól oldotta meg: " + wordSpelling.areEqual(word));


    }
}
