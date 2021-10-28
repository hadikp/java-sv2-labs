package enumtype.solarsystem;

public enum SolarSystem {
    MERKUR(0), VÉNUSZ(0), FÖLD(1), MARS(0), JUPITER(79), SZATURNUSZ(13), NEPTUNUSZ(14), PLUTO(0);

    private final int holdNum;

    SolarSystem(int holdNum) {
        this.holdNum = holdNum;
    }

    public int getHoldNum() {
        return holdNum;
    }
}
