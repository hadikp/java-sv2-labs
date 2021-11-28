package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    @Test
    void testAddList() {
        PublicVehicle bus = new Bus(11, 23, "Mercedes");
        PublicVehicle tram = new Tram(11, 23, 3);
        PublicVehicle metro = new Metro(11, 23, 15);

        PublicTransport publicTransport = new PublicTransport();
        publicTransport.addVehicle(bus);
        publicTransport.addVehicle(tram);
        publicTransport.addVehicle(metro);
        assertEquals(3, publicTransport.getPublicVehicleList().size());
    }

}