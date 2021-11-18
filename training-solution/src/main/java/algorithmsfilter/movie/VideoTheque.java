package algorithmsfilter.movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {

    private List<Movie> movieList = new ArrayList<>();

    public void addList (Movie movie) {
        movieList.add(movie);
    }

    public List<Movie> addGoodRatingFilm () {
        List<Movie> movieThreeRating = new ArrayList<>();
        for (Movie m: movieList) {
            if (m.getRating() > 3) {
                movieThreeRating.add(m);
            }
        }
        return movieThreeRating;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }
}
