package chars;

public class Whitespace {
   public String  makeWhitespaceToStar(String text) {
       String textUj = null;
       for (int i = 0; i < text.length(); i++) {
           if (Character.isWhitespace(text.charAt(i))) {
                textUj = text.replace(text.charAt(i), '*');
           }
       }
       return textUj;
   }

    public static void main(String[] args) {
        Whitespace whitespace = new Whitespace();
        System.out.println(whitespace.makeWhitespaceToStar("he  l lo "));
    }
}
