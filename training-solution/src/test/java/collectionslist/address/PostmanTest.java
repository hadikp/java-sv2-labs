package collectionslist.address;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostmanTest {

    Postman postman;

    @BeforeEach
    void init() {
        postman = new Postman();
        postman.addAddress("Veszprém, Búzavirág út 5.");
        postman.addAddress("Székesfehérvár, Széchenyi út 5.");
        postman.addAddress("Veszprém, Búzavirág út 5.");
        postman.addAddress("Bárna, Fenyves út 1.");
        postman.addAddress("Székesfehérvár, Széchenyi út 5.");
    }

    @Test
    void testInit() {
        assertEquals(5, postman.getAddresses().size());
    }

    @Test
    void testRemoveAddress() {
        postman.removeAddress("Székesfehérvár, Széchenyi út 5.");
        assertEquals(4, postman.getAddresses().size());
        assertEquals("Veszprém, Búzavirág út 5.", postman.getAddresses().get(1));

    }

}