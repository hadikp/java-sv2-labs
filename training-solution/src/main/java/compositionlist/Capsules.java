package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> listColor = new ArrayList<>();

    public void addfirst(String capFirst) {
        listColor.add(0, capFirst);
    }

    public void addLast(String capLast) {
        listColor.add(capLast);
    }

    public void removeFirst() {
        listColor.remove(0);
    }

    public void removeLast() {
        listColor.remove(listColor.size()-1);
    }

    public List<String> getColors() {
        return listColor;
    }
}
