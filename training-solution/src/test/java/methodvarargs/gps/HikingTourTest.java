package methodvarargs.gps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HikingTourTest {

    HikingTour hTour;
    FieldPoint field1;
    FieldPoint field2;

    @BeforeEach
    void init() {
        field1 = new FieldPoint(LocalDateTime.of(2021, 11, 20, 8, 11),
                41.40338, 2.17403);
        field2 = new FieldPoint(LocalDateTime.of(2021, 11, 21, 9, 11),
                42.40338, 3.17403);
        hTour = new HikingTour();
    }

    @Test
    void testHiking () {
        hTour.logFieldPoints(LocalDateTime.of(2022, 11, 22, 21, 22), field1, field2);
        assertEquals(2, hTour.getFieldPointsList().size());
        System.out.println(hTour.getFieldPointsList().get(0).getTimeOfLogging());
    }

    @Test
    void testTimeOfLoggingNull () {
        LocalDateTime ldt = null;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> field1.setTimeOfLogging(ldt));
        assertEquals("Nem adtad meg az adatok beküldési idejét!", exception.getMessage());
    }

}