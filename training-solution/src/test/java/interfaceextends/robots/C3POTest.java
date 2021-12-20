package interfaceextends.robots;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C3POTest {

    @Test
    void testmoveTo() {
        Point nullposition = new Point(0, 0, 0);
        Point onePosition = new Point(1, 2, 0);
        C3PO c3PO = new C3PO(nullposition);
        c3PO.moveTo(onePosition);
        System.out.println(c3PO.getPath().get(0).getX());
        System.out.println(c3PO.getPath().get(0).getY());
        System.out.println(c3PO.getPath().get(1).getX());
        System.out.println(c3PO.getPath().get(1).getY());
        System.out.println();

        Point nextPosition = new Point(3, 6, 0);
        c3PO.fastMoveTo(nextPosition);
        System.out.println(c3PO.getPath().get(0).getX());
        System.out.println(c3PO.getPath().get(0).getY());
        System.out.println(c3PO.getPath().get(1).getX());
        System.out.println(c3PO.getPath().get(1).getY());
        System.out.println(c3PO.getPath().get(2).getX());
        System.out.println(c3PO.getPath().get(2).getY());

    }

}