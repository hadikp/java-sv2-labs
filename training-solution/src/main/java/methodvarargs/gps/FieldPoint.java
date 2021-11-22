package methodvarargs.gps;

import java.time.LocalDateTime;

public class FieldPoint {

    private LocalDateTime timeOfSetting; //Adatgyűjtés ideje
    private LocalDateTime timeOfLogging; //időpont, amikor az adatok beküldésre kerültek
    private double latitude; //Földrajzi szélesség, koordinata
    private double longitude ; //Földrajzi hosszúság

    public FieldPoint(LocalDateTime timeOfSetting, double latitude, double longitude) {
        this.timeOfSetting = timeOfSetting;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public LocalDateTime getTimeOfSetting() {
        return timeOfSetting;
    }

    public LocalDateTime getTimeOfLogging() {
        return this.timeOfLogging;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setTimeOfLogging(LocalDateTime timeOfLogging) {
        if (timeOfLogging == null) {
            throw new IllegalArgumentException("Nem adtad meg az adatok beküldési idejét!");
        }
        this.timeOfLogging = timeOfLogging;
    }
}
