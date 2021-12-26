package exceptionresource.siblings;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SiblingsTest {

    Siblings siblings = new Siblings();

    @Test
    void testGetFullNames() {
        Path path = Path.of("src/test/resources/sliblings.txt");
        List<String> names = siblings.getFullNames("Szász", path);
        List<String> expected = Arrays.asList("Szász Emese", "Szász Ferenc");
        assertEquals(expected, siblings.getFullNames("Szász", path));
    }

    @Test
    void testCantReadFile() {
        Path path = Path.of("src/test/resources/sliblings.t");
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> siblings.getFullNames("Szász", path));
        assertEquals("Cant read a file!", iae.getMessage());
    }

}