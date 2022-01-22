package lambdaprimitives.cargo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TruckTest {

    Truck truck;

    @BeforeEach
    void init() {
        Cargo vonat = new Cargo("vonat", 11500, 100);
        Cargo auto = new Cargo("autó", 1150, 5);
        Cargo kamion = new Cargo("kamion", 5150, 10);
        Cargo furgon = new Cargo("furgon", 3150, 8);
        truck = new Truck(Arrays.asList(vonat, auto, kamion, furgon));
    }

    @Test
    void testGetShortestLength() {
        assertEquals(5.0, truck.getShortestLength());
    }

    @Test
    void testGetTotalWeight() {
        assertEquals(20950, truck.getTotalWeight());
    }

    @Test
    void testGetAverageWeight() {
        assertEquals(5237.5, truck.getAverageWeight());
    }

    @Test
    void testGetMaxWeight() {
        assertEquals(11500, truck.getMaxWeight());
    }

    @Test
    void testGetWeightStatistics() {
        System.out.println(truck.getWeightStatistics());
    }



}