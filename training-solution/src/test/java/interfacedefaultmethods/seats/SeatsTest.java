package interfacedefaultmethods.seats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatsTest {

    @Test
    void testFamilyCar() {
        Seats familyCar = new FamilyCar();
        assertEquals(5, familyCar.getNumberOfSeats());
    }

    @Test
    void testSportsCar() {
        Seats sportsCar = new SportsCar();
        assertEquals(2, sportsCar.getNumberOfSeats());
    }

    @Test
    void testCar() {
        Seats car = new Car("Skoda", 4);
        assertEquals(4, car.getNumberOfSeats());
    }

}