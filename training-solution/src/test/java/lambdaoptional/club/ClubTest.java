package lambdaoptional.club;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ClubTest {

    Club club;

    @BeforeEach
    void init() {
        Member peter = new Member("Péter", Arrays.asList("Java", "OOP"));
        Member janos = new Member("János", Arrays.asList("NET", "OOP"));
        Member andi = new Member("Andi", Arrays.asList("Java", "Python", "NET"));
        club = new Club(Arrays.asList(peter, janos, andi));
    }

    @Test
    void testFindFirst() {
        assertTrue(club.findFirst(member -> member.getName().equals("Péter")).isPresent());
        assertFalse(club.findFirst(member -> member.getName().equals("Joe")).isPresent());
    }

    @Test
    void testAverageNumberOfSkills() {
        assertEquals(2.33, club.averageNumberOfSkills().get(), 0.005);
    }

}