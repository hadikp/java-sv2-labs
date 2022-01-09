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
    List<LostProperty> lostProperties;


    @BeforeEach
    void init() {
        ruha = new LostProperty("1", "ruha", LocalDate.of(2022, 01, 5));
        ora = new LostProperty("2", "ora", LocalDate.of(2022, 01, 6));
        alma = new LostProperty("3", "ako", LocalDate.of(2022, 01, 8));
        ako = new LostProperty("4", "ako", LocalDate.of(2022, 01, 12));
        lostProperties = new ArrayList<>() ;
        lostProperties.add(ako);
        lostProperties.add(ruha);
        lostProperties.add(ora);
        lostProperties.add(alma);

        office = new LostAndFoundOffice(lostProperties);
        Collections.sort(lostProperties);
    }
    @Test
    void testCompare() {
        System.out.println(office.getLostProperties());
    }

    @Test
    void testFind() {
        System.out.println(office.findLostProperty(ora));
    }


}