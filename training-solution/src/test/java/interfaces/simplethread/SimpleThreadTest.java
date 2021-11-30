package interfaces.simplethread;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SimpleThreadTest {

    @Test
    void testRun() {
        List<String> stringList = Arrays.asList("Reggeli készítés", "Ebéd főzés", "Délutáni pihenés", "Esti tévézés");
        SimpleThread st = new SimpleThread(stringList);
        st.run();
    }

}