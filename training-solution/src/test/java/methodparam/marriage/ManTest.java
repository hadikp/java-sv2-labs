package methodparam.marriage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ManTest {

    Man man;

    @BeforeEach
    void init () {
        RegisterDate regPeter = new RegisterDate("születés ideje", LocalDate.of(1971, 10, 25));
        List<RegisterDate> registerDates = new ArrayList<>(Arrays.asList(regPeter));
        man = new Man("Péter", registerDates);
    }

    @Test
    void manDataTest () {
        assertEquals("Péter", man.getName());
        List<RegisterDate> expextedList = man.getRegisterDatesListM();
        assertEquals(1, expextedList.size());
        assertEquals("születés ideje", expextedList.get(0).getDescription());
    }

}