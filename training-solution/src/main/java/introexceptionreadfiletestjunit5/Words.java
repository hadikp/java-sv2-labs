package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Words {

    public List<String> readFile (Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file!", ioe);
        }
    }

    public String getFirstWordWithA(Path path) {
        List<String>  wordsList = readFile(path);
        for (String st: wordsList) {
            if (st.startsWith("A")) {
                return st;
            }
        }
       return "A";
    }

}
