package statemachine.seatheater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatHeaterStateTest {

    @Test
    void testSeatHeater() {
        assertEquals(SeatHeaterState.THIRD, SeatHeaterState.OFF.next());
        assertEquals(SeatHeaterState.SECOND, SeatHeaterState.THIRD.next());
        assertEquals(SeatHeaterState.FIRST, SeatHeaterState.SECOND.next());
        assertEquals(SeatHeaterState.OFF, SeatHeaterState.FIRST.next());

    }

}