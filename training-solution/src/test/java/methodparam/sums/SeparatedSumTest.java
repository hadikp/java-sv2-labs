package methodparam.sums;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumTest {

    SeparatedSum sepSum;
    Path path;

    @BeforeEach
    void init() {
        sepSum = new SeparatedSum();
        path = Paths.get("src/test/resources/floatingnumbers.txt");
    }

    @Test
    void testSum () {
        SumPosNeg result = sepSum.sum(sepSum.fileReading(path), path);
        assertEquals(-153.3, result.getSumNegative(), 0.005);
        assertEquals(110.6, result.getSumPositive(), 0.005);
    }

}