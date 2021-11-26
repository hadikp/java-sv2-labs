package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassRoomTest {

    @Test
    void testIsSuitable() {
        ClassRoom eszak = new ClassRoom("Északi terem", 50, Facility.CHALKBOARD);
        ClassRoom del = new ClassRoom("Déli terem", 150, Facility.COMPUTERS);
        ClassRoom nyugat = new ClassRoom("Nyugati terem", 250, Facility.PROJECTOR);
        Course courseComp = new Course(60, Facility.COMPUTERS);
        Course courseProjektor = new Course(160, Facility.PROJECTOR);

        assertTrue(del.isSuitable(courseComp));
        assertFalse(eszak.isSuitable(courseComp));
        assertFalse(nyugat.isSuitable(courseComp));

        assertTrue(nyugat.isSuitable(courseProjektor));
        assertFalse(del.isSuitable(courseProjektor));
    }

}