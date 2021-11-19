package algorithmstransformation.family;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    @Test
    void testAgeList () {
        List<FamilyMember> familyMemberList = Arrays.asList(new FamilyMember("Hadik Péter", 50),
                new FamilyMember("Hadik Lajos", 70), new FamilyMember("Hadik Péter", 22));
        Family family = new Family(familyMemberList);
        List<Integer> expected = family.addFirtsname("Péter");

        assertEquals(Arrays.asList(50, 22), expected);
        assertTrue(expected.contains(50));
        assertTrue(expected.contains(22));
        System.out.println(family.addFirtsname("Péter"));
    }

}