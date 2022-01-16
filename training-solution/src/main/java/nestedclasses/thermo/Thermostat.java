package nestedclasses.thermo;

import java.util.ArrayList;
import java.util.List;

public class Thermostat {

    private List<ThermoMeter> thermoMeters = new ArrayList<>();
    private List<String> roomsToHeat = new ArrayList<>(); //fűtött szobák nevei
    public final static int TEMPERATURE_LIMIT = 23;

    public void addThermometer(ThermoMeter thermoMeter) {
        thermoMeter.setThermometerObserver(new ThermometerObserver() {
            @Override
            public void handleTemperatureChange(int temp, String room) {
                if (temp < TEMPERATURE_LIMIT) {
                    roomsToHeat.add(room);
                }
            }
        });
        thermoMeters.add(thermoMeter);
    }



    public List<String> getRoomsToHeat() {
        return roomsToHeat;
    }

    public List<ThermoMeter> getThermoMeters() {
        return thermoMeters;
    }
}
