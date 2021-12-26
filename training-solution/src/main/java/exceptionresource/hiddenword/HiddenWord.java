package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class HiddenWord {

    public String getHiddenWord(Path path) {
        StringBuilder sb = new StringBuilder("A keresett szó: ");
        try (Scanner sc = new Scanner(path)) {
            while (sc.hasNext()) {
                String line = sc.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    if (Character.isAlphabetic(line.charAt(i))) {
                        sb.append(line.charAt(i));
                    }
                }
            }
        }
        catch (IOException ioe) {
            throw new IllegalArgumentException("A keresett file nem található!");
        }
        return sb.toString();
    }
}
