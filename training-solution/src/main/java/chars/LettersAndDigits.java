package chars;

public class LettersAndDigits {
   public void printLetterOrDigit(String text) {
       for (char c: text.toCharArray()) {
           if (Character.isAlphabetic(c)) {
               System.out.println("betű");
           } else if (Character.isDigit(c)) {
               System.out.println("számjegy");
           } else System.out.println("egyéb");

       }
   }

    public static void main(String[] args) {
        String text = "hello";
        LettersAndDigits word = new LettersAndDigits();
        word.printLetterOrDigit("he6ll o123 ");
    }
}
