package collectionsmap.trip;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClassTripTest {

    ClassTrip classTrip;
    Path path;

    @BeforeEach
    void init() {
         classTrip = new ClassTrip();
         path = Path.of("src/test/resources/inpayments.txt");
    }

    @Test
    void testReadFile() {
        List<String> readFile = classTrip.loadInpayments(path);
        assertEquals(3, readFile.size());
    }

    @Test
    void testLoadMap() {
        classTrip.loadMap(path);
        assertEquals(3, classTrip.getMoney().size());
        assertTrue(classTrip.getMoney().containsKey("Kiss József"));
        assertTrue(classTrip.getMoney().containsValue(15000));

    }

}