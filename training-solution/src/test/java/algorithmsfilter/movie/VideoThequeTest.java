package algorithmsfilter.movie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VideoThequeTest {

    VideoTheque video;

    @BeforeEach
    void init() {
        video = new VideoTheque();
        video.addList(new Movie("Éden", Cathegory.SCIFI, 4));
        video.addList(new Movie("Királynői bosszú", Cathegory.THRILLER, 2));
        video.addList(new Movie("Nyolcadik utas a halál", Cathegory.SCIFI, 3));
        video.addList(new Movie("A szerelem útján", Cathegory.ROMANTIKUS, 4));
    }

    @Test
    void testAddList () {
        video.addList(new Movie("Terminátor", Cathegory.AKCIÓFILM, 4));
        assertEquals(5, video.getMovieList().size());
    }

    @Test
    void testGoodRating () {
        assertEquals(2, video.addGoodRatingFilm().size());
    }
}