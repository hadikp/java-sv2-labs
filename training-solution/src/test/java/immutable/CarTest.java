package immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testCarData () {
        Car car = new Car("Skoda", "Fábia", 2011);
        assertEquals("Skoda", car.getBrand());
    }

    @Test
    void testWithNullBrand () {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Car(null, "Fábia", 2022));
        assertEquals("Hibás adatokat adtál meg!", exception.getMessage());
    }

    @Test
    void testWithEmptyBrand () {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Car("", "Fábia", 2022));
        assertEquals("Hibás adatokat adtál meg!", exception.getMessage());
    }

}