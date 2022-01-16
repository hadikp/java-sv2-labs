package nestedclasses.thermo;

public class ThermoMeter {

    private String room;
    private int temperature;
    private ThermometerObserver thermometerObserver;

    public ThermoMeter(String room, int temperature) {
        this.room = room;
        this.temperature = temperature;
    }

    public void onTemperatureChanged() {
        thermometerObserver.handleTemperatureChange(temperature, room);
    }

    public void setThermometerObserver(ThermometerObserver thermometerObserver) { //A figyelő bejegyzi magát mint figyelő
        this.thermometerObserver = thermometerObserver;
        onTemperatureChanged();
    }

    public String getRoom() {
        return room;
    }

    public int getTemperature() {
        return temperature;
    }

    public ThermometerObserver getThermometerObserver() {
        return thermometerObserver;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        onTemperatureChanged();
    }
}
