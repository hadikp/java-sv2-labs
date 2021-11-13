package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Holiday {
    public static void main(String[] args) {
        try {
            List<String> dressList = Files.readAllLines(Paths.get("C:/H/ujratervez2021/SEalapok1/java-sv2-labs/training-solution/src/main/java/introexceptionreadfile/holiday.txt"));
            System.out.println(dressList);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
