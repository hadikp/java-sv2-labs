package enumtype.solarsystem;

public class SolarSystemMain {
    public static void main(String[] args) {
        SolarSystem planet = SolarSystem.MERKUR;
        System.out.println("Merkúr holdjnainak a száma: " + planet.getHoldNum());
        System.out.println("Vénusz holdjnainak a száma: " + SolarSystem.VÉNUSZ.getHoldNum());
        System.out.println("Föld holdjnainak a száma: " + SolarSystem.FÖLD.getHoldNum());
        System.out.println("Szaturnusz holdjnainak a száma: " + SolarSystem.SZATURNUSZ.getHoldNum());
        System.out.println("JUPITER holdjnainak a száma: " + SolarSystem.JUPITER.getHoldNum());

    }
}
