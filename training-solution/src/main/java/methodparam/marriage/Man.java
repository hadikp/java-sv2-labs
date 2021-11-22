package methodparam.marriage;

import java.util.List;

public class Man {

    private String name;
    private List<RegisterDate> registerDatesListM;

    public Man(String name, List<RegisterDate> registerDates) {
        this.name = name;
        this.registerDatesListM = registerDates;
    }

    public String getName() {
        return name;
    }

    public List<RegisterDate> getRegisterDatesListM() {
        return registerDatesListM;
    }
}
