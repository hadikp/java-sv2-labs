package objectclass.bag;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.beans.beancontext.BeanContextServiceProviderBeanInfo;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBagTest {

    SimpleBag simpleBag;
    Book book1;
    Book book2;
    Beer beer1;
    Beer beer2;

    @BeforeEach
    void init() {
        simpleBag = new SimpleBag();
        book1 = new Book("Asimov", "Positron ember");
        book2 = new Book("Gárdonyi", "Egri csillagok");
        beer1 = new Beer("Dreher", 300);
        beer2 = new Beer("Kőbányai", 400);
    }

    @Test
    void testPutItem() {
         simpleBag.putItem(beer1);
         simpleBag.putItem(book1);
         assertEquals(2, simpleBag.size());

        System.out.println(simpleBag.getItemsList().get(1));
    }

    @Test
    void testIsEmpty() {
        assertTrue(simpleBag.isEmpty());
        simpleBag.putItem(beer1);
        assertFalse(simpleBag.isEmpty());
    }

    @Test
    void testSize() {
        assertEquals(0, simpleBag.size());
        simpleBag.putItem(beer1);
        assertEquals(1, simpleBag.size());
    }

    @Test
    void testContains() {
        simpleBag.putItem(book1);
        assertTrue(simpleBag.contains(book1));
        assertFalse(simpleBag.contains(book2));
    }

}