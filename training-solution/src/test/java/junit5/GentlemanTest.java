package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    void testSayHello() {
        Gentleman gentleman = new Gentleman();

        String welcome = gentleman.sayHello("John Doe");

        assertEquals("Hello John Doe", welcome);
    }

    @Test
    void testSayHelloNull() {
        Gentleman gentleman = new Gentleman();
        String name = null;

        String welcome = gentleman.sayHello(name);

        assertEquals("Hello Anonimusz!", welcome);
    }



}
