package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTest {

    @Test
    void testSort() {
        int[] revenues = {110, 220, 3550, 100, 97, 1200, 200, 3200, 99};
        Income income = new Income(revenues);
        assertEquals(3550, income.getHighestIncome());
    }

}