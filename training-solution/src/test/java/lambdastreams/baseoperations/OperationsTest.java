package lambdastreams.baseoperations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    Operations operations;

    @BeforeEach
    void init() {
        operations = new Operations(Arrays.asList(4, 6, 1, 4, 11, 2, 33, 44, 1));
    }

    @Test
    void testMin() {
        assertEquals(1, operations.min().get());
    }

    @Test
    void testSum() {
        assertEquals(106, operations.sum());
    }

    @Test
    void testIsPositive() {
        assertTrue(operations.isAllPositive());
    }

    @Test
    void testGetDistinctElements() {
        System.out.println(operations.getDistinctElements());
    }

}