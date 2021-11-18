package algorithmsdecision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void testPrime () {
        Prime prime = new Prime();
        assertTrue(prime.isPrime(7));
        assertTrue(prime.isPrime(13));
        assertFalse(prime.isPrime(6));
        assertTrue(prime.isPrime(2));
    }

}