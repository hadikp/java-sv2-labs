package nestedclasses.thermo;

public class ThermoMeter {

    private String room;
    private int temperature;
    private ThermometerObserver thermometerObserver;

    public ThermoMeter(String room, int temperature, ThermometerObserver thermometerObserver) {
        this.room = room;
        this.temperature = temperature;
        this.thermometerObserver = null;
    }

    public void onTemperatureChanged() {
        System.out.println();
    }

    public void setThermometerObserver(ThermometerObserver observer) {
        System.out.println();
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
    }
}
