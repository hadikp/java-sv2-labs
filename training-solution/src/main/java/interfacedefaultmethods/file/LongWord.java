package interfacedefaultmethods.file;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LongWord implements FileOperations {

    @Override
    public String getLongWord(Path path) {
        List<String> readfile = new ArrayList<>();
        readfile = readFromFile(path);
        String result = readfile.get(0) + readfile.get(readfile.size()-1);
        return result;
    }
}
