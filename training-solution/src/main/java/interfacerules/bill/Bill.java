package interfacerules.bill;

import com.sun.source.tree.BreakTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Bill {

    public List<String> readBillItemsFromFile(Path path) {
        List<String> files = new ArrayList<>();
        try {
            files = Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
        return files;
    }

}
