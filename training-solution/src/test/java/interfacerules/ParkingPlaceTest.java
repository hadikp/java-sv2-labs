package interfacerules;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingPlaceTest {

    @Test
    void testParkingPlace() {
        ParkingPlace parkingPlace = new ParkingPlace();
        System.out.println(parkingPlace.getLength());
        System.out.println(parkingPlace.getWidth());
    }

}