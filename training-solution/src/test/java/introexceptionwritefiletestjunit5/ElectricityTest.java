package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElectricityTest {

    @TempDir
    File temporaryFolder;

    @Test
    void writeStreets () throws IOException {
        Path path = temporaryFolder.toPath().resolve("streets.txt");
        System.out.println(path);
        LocalDate date = LocalDate.now();
        List<String> pauseList = Arrays.asList(date + ": Széchenyi utca", "Kis Pál utca", "Budai út");
        new Electricity().writeStreets(path, pauseList);
        List<String> load = Files.readAllLines(path);
        assertEquals(pauseList, load);
    }
}
