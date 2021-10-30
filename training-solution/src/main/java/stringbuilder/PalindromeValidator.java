package stringbuilder;

public class PalindromeValidator {
    public boolean isPalindrome(String word) {
        StringBuilder sb = new StringBuilder(word);
        //String withoutWhitespace = word.replace(" ", "");
        StringBuilder reverse = sb.reverse();
        //String.valueOf(reverse).replace(" ", "");
        return  (word.equalsIgnoreCase(String.valueOf(reverse))) ? true : false;
    }

    public static void main(String[] args) {
        PalindromeValidator pd = new PalindromeValidator();
        String word = "dagad"; //kajak
        System.out.println("A " + word + " szó palindróma: " + pd.isPalindrome(word));
        ;
    }
}
