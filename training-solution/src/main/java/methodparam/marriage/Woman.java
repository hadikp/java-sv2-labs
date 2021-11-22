package methodparam.marriage;

import java.util.List;

public class Woman {

    private String name;
    private List<RegisterDate> registerDatesListW;

    public Woman(String name, List<RegisterDate> registerDates) {
        this.name = name;
        this.registerDatesListW = registerDates;
    }

    public String getName() {
        return name;
    }

    public List<RegisterDate> getRegisterDatesListW() {
        return registerDatesListW;
    }
}
