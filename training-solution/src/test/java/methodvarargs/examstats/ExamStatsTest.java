package methodvarargs.examstats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamStatsTest {

    ExamStats examStats;

    @BeforeEach
    void init() {
        examStats = new ExamStats(100);
    }


    @Test
    void testGetNumberOfTopGrades () {
        int actual = examStats.getNumberOfTopGrades(80, 61, 33, 77, 88, 22, 11, 89);
        assertEquals(2, actual);
    }

    @Test
    void testHasAnyFailed () {
        boolean actual = examStats.hasAnyFailed(60, 61, 77, 88, 22, 11, 89);
        assertTrue(actual);
    }

}