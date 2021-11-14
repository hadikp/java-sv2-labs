package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {
    public static void main(String[] args) {
        List<String> itinerList = Arrays.asList("Székesfehérvár", "Agárd", "Velence", "Budapest", "Hatvan", "Kisterenye", "Bárna");
        String pathName = "C:/H/ujratervez2021/SEalapok1/java-sv2-labs/training-solution/src/main/java/introexceptionwritefile/itiner.txt";
        try {
            Files.write(Paths.get(pathName), itinerList);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
