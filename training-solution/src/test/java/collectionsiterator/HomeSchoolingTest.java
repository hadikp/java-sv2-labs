package collectionsiterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class HomeSchoolingTest {

    HomeSchooling homeSchooling;

    @BeforeEach
    void init() {
        OnlineLesson matek = new OnlineLesson("Matematika", LocalTime.of(10, 00));
        OnlineLesson kemia = new OnlineLesson("Kémia", LocalTime.of(8, 11));
        OnlineLesson fizika = new OnlineLesson("Fizika", LocalTime.of(9, 10));
        OnlineLesson tesi = new OnlineLesson("Testnevelés", LocalTime.of(7, 15));
        OnlineLesson matek2 = new OnlineLesson("Matematika", LocalTime.of(11, 10));
        Set<OnlineLesson> timetable = new TreeSet<>();
        homeSchooling = new HomeSchooling();
        homeSchooling.addMap(matek);
        homeSchooling.addMap(kemia);
        homeSchooling.addMap(fizika);
        homeSchooling.addMap(tesi);
        homeSchooling.addMap(matek2);
    }

    @Test
    void testInit() {
        assertEquals(5, homeSchooling.getTimetable().size());
    }

    @Test
    void testGetLessonsByTitle() {
        System.out.println(homeSchooling.getLessonsByTitle("Matematika"));

    }

}