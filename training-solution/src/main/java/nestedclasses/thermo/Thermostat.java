package nestedclasses.thermo;

import java.util.ArrayList;
import java.util.List;

public class Thermostat {

    private List<ThermoMeter> thermoMeters = new ArrayList<>();
    private List<String> roomsToHeat = new ArrayList<>(); //fűtött szobák nevei
    public final static int TEMPERATURE_LIMIT = 23;

    public void addThermometer(ThermoMeter thermoMeter) {
        thermoMeters.add(thermoMeter);
    }
}
