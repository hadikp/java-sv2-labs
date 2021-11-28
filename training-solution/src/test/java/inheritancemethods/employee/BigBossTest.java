package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigBossTest {

    @Test
    void testGetSalary() {
        BigBoss bigBoss = new BigBoss("Péter", "Budakeszi", 100_000, 200, 100_000);
        assertEquals(2100_000, bigBoss.getSalary());
    }

}