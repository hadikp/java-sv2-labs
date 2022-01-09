package searching.lostproperty;

import java.util.List;
import java.util.Set;

public class LostAndFoundOffice {

    private Set<LostProperty> lostProperties;

    public LostAndFoundOffice(Set<LostProperty> lostProperties) {
        this.lostProperties = lostProperties;
    }

    public Set<LostProperty> getLostProperties() {
        return lostProperties;
    }
}
