package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Shopping {
    public static void main(String[] args) {
        try {
            List<String> shoppingList = Files.readAllLines(Paths.get("C:/H/ujratervez2021/SEalapok1/java-sv2-labs/training-solution/src/main/java/introexceptionreadfile/shoppingList.txt"));
            System.out.println(shoppingList);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
