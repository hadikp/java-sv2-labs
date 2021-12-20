package interfacestaticmethods.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testBicycle() {
        Vehicle vehicle = Vehicle.of(2);
        assertEquals(Bicycle.class, vehicle.getClass());
    }

    @Test
    void testCar() {
        Vehicle vehicle = Vehicle.of(4);
        assertEquals(Car.class, vehicle.getClass());
    }

    @Test
    void testWrongParameter() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> Vehicle.of(5));
        assertEquals("Nem jó a kerekek száma!", iae.getMessage());
    }

}