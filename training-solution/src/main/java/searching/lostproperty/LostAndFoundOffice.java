package searching.lostproperty;

import java.util.*;

public class LostAndFoundOffice {

    private Set<LostProperty> lostProperties = new TreeSet<>();

    public LostAndFoundOffice(Set<LostProperty> lostProperties) {
        this.lostProperties = lostProperties;
    }

    public void findLostProperty(String description) {
        //int index = Collections.binarySearch(lostProperties, description);
       // return lostProperties.;

    }

    public Set<LostProperty> getLostProperties() {
        return lostProperties;
    }
}
