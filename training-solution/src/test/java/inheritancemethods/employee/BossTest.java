package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BossTest {

    @Test
    void testGetSalary() {
        Boss boss = new Boss("Péter", "Csókakö", 100_000, 200);
        assertEquals(2000_000, boss.getSalary());
    }

}