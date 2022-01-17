package lambdaintro.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsedCarsTest {

    UsedCars usedCars;

    @BeforeEach
    void init() {
        Car skoda = new Car("skoda", "fábia", 100_000, 5);
        Car octavia = new Car("skoda", "octavia", 200_000, 7);
        Car trabant = new Car("trabant", "4 ütemű", 20_000, 4);
        Car bmw = new Car("bmw", "elektromos", 1_000_000, 6);
        List<Car> sellCars = new ArrayList<>(Arrays.asList(skoda, trabant, bmw, octavia));
        usedCars = new UsedCars(sellCars);
    }

    @Test
    void testListCarsByPrice() {
        assertEquals("trabant", usedCars.listCarsByPrice().get(0).getBrand());
        assertEquals("bmw", usedCars.listCarsByPrice().get(3).getBrand());

    }

    @Test
    void testListCarsByLengthDesc() {
        assertEquals("octavia", usedCars.listCarsByLengthDesc().get(0).getType());
        assertEquals("trabant", usedCars.listCarsByLengthDesc().get(3).getBrand());
    }

    @Test
    void testListCarsOneBrandByType() {
        System.out.println(usedCars.listCarsOneBrandByType("skoda"));
    }

}