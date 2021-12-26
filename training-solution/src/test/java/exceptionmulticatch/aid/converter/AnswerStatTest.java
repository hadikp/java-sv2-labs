package exceptionmulticatch.aid.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnswerStatTest {

    BinaryStringConverter bsc = new BinaryStringConverter();
    AnswerStat answerStat = new AnswerStat(bsc);

    @Test
    void testConvertInputWrongString() {
        String input = "10201";
        InvalidBinaryStringException iae = assertThrows(InvalidBinaryStringException.class, () -> answerStat.convert(input));
        assertEquals("A bemenő paraméter csak 0 és 1 lehet!", iae.getCause().getMessage());
    }

    @Test
    void testConvertInputNull() {
        String inputNull = null;
        InvalidBinaryStringException iae = assertThrows(InvalidBinaryStringException.class, () -> answerStat.convert(inputNull));
        assertEquals("Null értékű paramétert adtál meg!", iae.getCause().getMessage());
    }

    @Test
    void testAnswerTruePercent() {
        String input = "10101000000";
        assertEquals(27, answerStat.answerTruePercent(input));
    }


}