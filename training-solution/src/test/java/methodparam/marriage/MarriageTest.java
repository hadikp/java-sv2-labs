package methodparam.marriage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {

    Marriage marriage;
    Man man;
    Woman woman;

    @BeforeEach
    void init () {
        marriage = new Marriage();
        RegisterDate regPeter = new RegisterDate("születés ideje", LocalDate.of(1971, 10, 25));
        List<RegisterDate> registerDatesM = new ArrayList<>(Arrays.asList(regPeter));
        man = new Man("Hadik Péter", registerDatesM);

        RegisterDate regEniko = new RegisterDate("születés ideje", LocalDate.of(1975, 06, 18));
        List<RegisterDate> registerDatesW = new ArrayList<>(Arrays.asList(regPeter));
        woman = new Woman("Várdai Enikő", registerDatesW);
    }

    @Test
    void testGetMarried () {
        marriage.getMarried(woman, man);
        assertEquals(2, man.getRegisterDatesListM().size());
        assertEquals(2, woman.getRegisterDatesListW().size());
        assertEquals("házasságkötés ideje", man.getRegisterDatesListM().get(1).getDescription());
        assertEquals(LocalDate.of(2021, 11, 22), woman.getRegisterDatesListW().get(1).getDate());
        System.out.println(woman.getRegisterDatesListW().get(0).getDescription());
    }

}