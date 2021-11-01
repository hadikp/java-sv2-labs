package stringscanner;

import java.util.Scanner;

public class IntScanner {

    public void convertInts(String ints) {
        Scanner scText = new Scanner(ints).useDelimiter(";");
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        while (scText.hasNext()) {
            String numString = scText.next();
            int numInt = Integer.parseInt(numString);
            if (numInt > 100) {
                if (first) {
                    first = false;
                } else {
                    sb.append(", ");
                }
                sb.append(numInt);
            }
        } System.out.println(sb);
    }

    public void printInt(int num) {

    }

    public static void main(String[] args) {
        IntScanner intScan = new IntScanner();
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a szöveget!");
        String text = sc.nextLine(); // 5;3;107;12;123;18;198

        intScan.convertInts(text);
    }
}
