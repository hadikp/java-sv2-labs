package methodpass.troopers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrooperTest {

    Trooper trooper;

    @BeforeEach
    void init () {
        trooper = new Trooper("Péter");
    }

    @Test
    void testGetNullPosition () {
        assertEquals(0, trooper.getPosition().getPosX());
        assertEquals(0, trooper.getPosition().getPosY());
    }

    @Test
    void  testChangePosition () {
        Position target = new Position(100,220);
        assertEquals(100, trooper.changePosition(target).getPosX());
        assertEquals(220, trooper.changePosition(target).getPosY());
        assertEquals(100, trooper.getPosition().getPosX());
        assertEquals(220, trooper.getPosition().getPosY());
    }

    @Test
    void testDistanceFromNullToTarget () {
        Position target = new Position(100,200);
        assertEquals(223.606, trooper.distanceFrom(target), 0.005);
    }

    @Test
    void testDistanceFromTarget1ToTarget2 () {
        Position target1 = new Position(100, 200);
        Position target2 = new Position(200,200);
        trooper.changePosition(target2);
        assertEquals(223.606, trooper.distanceFrom(target1), 0.005);
    }


}