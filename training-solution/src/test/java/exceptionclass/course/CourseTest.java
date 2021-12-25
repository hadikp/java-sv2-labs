package exceptionclass.course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    Course course;
    SimpleTime begin;

    @Test
    void testConstructor() {
        begin = new SimpleTime(8, 0);
        course = new Course("angol nyelv tanítás", begin);
        System.out.println(course);
    }

    @Test
    void testConstructorToString() {
        begin = new SimpleTime("1:59");
        course = new Course("angol nyelv tanítás", begin);
        System.out.println(course);
    }

}