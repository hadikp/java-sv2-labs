package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<String> titles = new ArrayList<>();
    private List<String> authors = new ArrayList<>();

    public void addBook(String title) {
        titles.add(title);
    }

    public void addAuthor(String author) {
        authors.add(author);
    }

    public void findBookAndSetAuthor(String title) {
        for (int i = 0; i < titles.size(); i++) {
            if (titles.get(i).equals(title)) {
                System.out.println("A keresett könyv - " + authors.get(i) + ": " + titles.get(i));
            }
        }
    }

    public List<String> getTitles() {
        return titles;
    }

    @Override
    public String toString() {
        return "Books{" +
                "titles=" + titles +
                ", author=" + authors +
                '}';
    }
}
