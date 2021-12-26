package exceptionresource.siblings;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Siblings {

    public List<String> getFullNames(String lastName, Path path) {
        List<String> result = new ArrayList<>();
        try (Scanner sc = new Scanner(path)) {
            while (sc.hasNext()) {
                String line = sc.nextLine();
                String addLine = String.format("%s %s", lastName, line);
                result.add(addLine);
            }
        }
        catch (IOException ioe) {
            throw new IllegalArgumentException("Cant read a file!", ioe);
        }
        return result;
    }
}
