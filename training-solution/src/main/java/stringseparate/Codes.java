package stringseparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Codes {

    private StringBuilder sb = new StringBuilder("Betűvel kezdődő kódok: ");

    public void getCodesStartWithLetter(List<String> codes) {
        boolean first = true;
        for (String c: codes) {
            int firstChar = c.charAt(0);
            if (Character.isAlphabetic(firstChar)) {
                if (first) {
                    first = false;
                } else {
                    sb.append(", ");
                }
                sb.append(c);
            }
        }
    }

    public StringBuilder getSb() {
        return sb;
    }

    public static void main(String[] args) {
        List<String> codeList = new ArrayList<>(Arrays.asList("T57fbj", "12tgh23", "xtcu45", "f578GVHd", "12tgh23", "32erwuvvH"));
        Codes codes = new Codes();

        codes.getCodesStartWithLetter(codeList);
        System.out.println(codes.getSb());
    }
}
