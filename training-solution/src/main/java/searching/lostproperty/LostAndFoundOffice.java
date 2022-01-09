package searching.lostproperty;

import java.util.*;

public class LostAndFoundOffice {

    private List<LostProperty> lostProperties = new ArrayList<>();

    public LostAndFoundOffice(List<LostProperty> lostProperties) {
        this.lostProperties = lostProperties;
    }

    public LostProperty findLostProperty(LostProperty description) {
        //Collections.sort(lostProperties);
        int index = Collections.binarySearch(lostProperties, description);
        if (index < 0) {
            throw new IllegalArgumentException("Nincs ilyen elveszett tárgy!");
        }
        return lostProperties.get(index);
    }

    public List<LostProperty> getLostProperties() {
        return new ArrayList<>(lostProperties);
    }
}
