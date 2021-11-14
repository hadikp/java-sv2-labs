package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class PaulStreetBoys {

    public List<String> fileRead (String fileName) {
        String pathName = "C:/H/ujratervez2021/SEalapok1/java-sv2-labs/training-solution/src/main/java/introexceptioncause/" + fileName;
        try {
            List<String> paulStreetList = Files.readAllLines(Paths.get(pathName));
            return paulStreetList;
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

    }

    public void printFile (List<String> paulStreetList) {
        for (String st: paulStreetList) {
            if ("Nemecsek Ernő".equals(st)) {
                System.out.println(st.toLowerCase());
            } else {
                System.out.println(st);
            }
        }
    }

    public static void main(String[] args) {
        PaulStreetBoys paulStrB = new PaulStreetBoys();

        try {
            paulStrB.printFile(paulStrB.fileRead("palutcaifiuk_.txt"));
        }
        catch (IllegalStateException ise) {
            ise.getCause().printStackTrace();

        }
    }
}
