package collectionsautoboxing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperTest {

    Paper paper;

    @BeforeEach
    void init() {
        paper = new Paper();
        paper.putFurtherPaper("1.a", 25);
        paper.putFurtherPaper("2.a", 15);
        paper.putFurtherPaper("2.a", 35);
        paper.putFurtherPaper("1.a", 45);
    }

    @Test
    void testPutFurtherPaper() {
        assertEquals(2, paper.getPapersKg().size());
    }

    @Test
    void testGetWinnerClass() {
        assertEquals("1.a", paper.getWinnerClass());
    }

    @Test
    void testGetTotalWeight() {
        assertEquals(120, paper.getTotalWeight());
    }

}