package introexceptionthrow;

import java.util.Scanner;


public class ShortWord {

    public String wordExamen(String word) {
        if (word.length() > 5) {
            throw new IllegalArgumentException("Túl hosszú a szó, rövidebbet kértem!");
        }

        for (int i = 0; i < word.length(); i++) {
            if (!Character.isAlphabetic(word.charAt(i))) {
                throw new IllegalArgumentException("Betűn kívül más karakter is van a szóban!");
            }
        }
        return word;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShortWord shortWord = new ShortWord();
        System.out.println("Kérek egy szót! A maximális hosszúsága öt betű lehet.");
        String word = sc.nextLine();
        System.out.println(shortWord.wordExamen(word));

    }
}
