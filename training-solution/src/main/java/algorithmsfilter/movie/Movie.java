package algorithmsfilter.movie;

public class Movie {
    private String title;
    private Cathegory cathegory;
    private int rating;

    public Movie(String title, Cathegory cathegory, int rating) {
        this.title = title;
        this.cathegory = cathegory;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public Cathegory getCathegory() {
        return cathegory;
    }

    public int getRating() {
        return rating;
    }
}
