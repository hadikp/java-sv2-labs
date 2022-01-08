package searching.pike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainTest {

    @Test
    void testBinarySearch() {
        int[] heights = {300, 350, 450, 600, 1000, 1200};
        Pike pike = new Pike("Kékes", 1000);
        Mountain mountain = new Mountain(heights);
        System.out.println(mountain.searchPike(pike));
    }

}