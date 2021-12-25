package exceptions.measurement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

    List<String> readfile;
    Measurement measurement;

    @BeforeEach
    void init() {
        Path path = Paths.get("src/test/resources/measurementdata.csv");
        measurement = new Measurement();
        readfile = measurement.readFromFile(path);
    }


    @Test
    void testReadfile() {
        assertEquals(11, readfile.size());
    }

    @Test
    void testValidate() {
        assertEquals(8, measurement.validate(readfile).size());
        assertEquals("2,12.4,John Doe,a", measurement.validate(readfile).get(0));
        assertEquals("9,12.4,", measurement.validate(readfile).get(7));
    }

}