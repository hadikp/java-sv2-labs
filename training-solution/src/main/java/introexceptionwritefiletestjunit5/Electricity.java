package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Electricity {


    public void createList (Path  path) {
        LocalDate date = LocalDate.now();
        List<String> pauseList = new ArrayList(Arrays.asList(date + ": Széchenyi utca", "Kis Pál utca", "Budai út"));
        //writeStreets(Path.of(pathName), pauseList);
       // return pauseList;
    }

    public void writeStreets(Path path, List<String> pauseList) {
        try {
            Files.write(path, pauseList);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Electricity e = new Electricity();
        //String pathName = "C:/H/ujratervez2021/SEalapok1/java-sv2-labs/training-solution/src/main/java/introexceptionwritefiletestjunit5/pause.txt";

    }
}
