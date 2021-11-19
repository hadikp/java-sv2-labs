package recursion;

public class Vowels {

    private int counter = 0;

    public int getNumberOfVowels(String word) {
        String vowels = "aáeéiíoóöőuúüű";
        if (word.length() >= 1) {
            if (vowels.contains(word.substring(0, 1))) {
                counter++;
                return getNumberOfVowels(word.substring(1));
            } else {
                getNumberOfVowels(word.substring(1));
            }
        }
        return counter;
    }
}
