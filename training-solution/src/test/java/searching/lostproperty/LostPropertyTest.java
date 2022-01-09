package searching.lostproperty;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class LostPropertyTest {
    LostProperty ruha;
    LostProperty ora;
    LostProperty alma;
    LostProperty ako;
    LostAndFoundOffice office;


    @BeforeEach
    void init() {
        ruha = new LostProperty("1", "ruha", LocalDate.of(2022, 01, 5));
        ora = new LostProperty("2", "ora", LocalDate.of(2022, 01, 6));
        alma = new LostProperty("3", "alma", LocalDate.of(2022, 01, 8));
        ako = new LostProperty("4", "akó", LocalDate.of(2022, 01, 12));
        Set<LostProperty> lostProperties = new TreeSet<>() ;
        lostProperties.add(ako);
        lostProperties.add(ruha);
        lostProperties.add(ora);
        lostProperties.add(alma);

        office = new LostAndFoundOffice(lostProperties);
    }
    @Test
    void testCompare() {
        ako.compareTo(ruha);
        System.out.println(office.getLostProperties());
    }


}