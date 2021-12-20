package interfacedefaultmethods.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public interface FileOperations {

    default List<String> readFromFile(Path path) {
        List<String> result = new ArrayList<>();
        try {
            result = Files.readAllLines(path);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return result;
    }

    String getLongWord(Path path);
}
