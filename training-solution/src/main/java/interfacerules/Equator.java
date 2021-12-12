package interfacerules;

public class Equator implements Name, Length {

    private static final String NAME = "Egyenlító";
    private static final double LENGTH = 40_075.0; //km

    @Override
    public double getLength() {
        return LENGTH;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
