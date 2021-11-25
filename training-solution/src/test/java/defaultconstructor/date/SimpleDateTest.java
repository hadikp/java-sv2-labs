package defaultconstructor.date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateTest {

    SimpleDate date;

    @BeforeEach
    void init() {
        date = new SimpleDate();
        date.setDate(2021, 11, 23);
    }

    @Test
    void testSetDateGoodData () {
        assertEquals(2021, date.getYear());
        assertEquals(11, date.getMonth());
        assertEquals(23, date.getDay());
    }

    @Test
    void testCalculateMonthLength() {
        assertEquals(29, date.calculateMonthLength(2016, 02));
        assertEquals(28, date.calculateMonthLength(2017, 02));
        assertEquals(31, date.calculateMonthLength(2017, 01));
    }

    @Test
    void testSetDateWrongData() {
       SimpleDate date2 = new SimpleDate();
       date2.setDate(2016, 02, 29);

    }

}