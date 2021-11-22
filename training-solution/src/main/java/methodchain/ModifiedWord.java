package methodchain;

import java.util.Locale;

public class ModifiedWord {

   public void modify(String word) {

       String[]  begin = word.substring(0, 4).toUpperCase().split("");
       for (int i = 1; i < 5; i++) {
           if (i == 1 || i == 3) {
               secondPlaceChange(i, begin);
           }
       }
       System.out.println(String.join("", begin));
   }

   public void secondPlaceChange (int i, String[] begin) {
       if (i == 1) {
           begin[i] = "x";
       } else if (i == 3) {
           begin[i] = "y";
       }
       //return this;
   }
}
