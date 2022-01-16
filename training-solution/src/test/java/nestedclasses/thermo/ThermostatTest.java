package nestedclasses.thermo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThermostatTest {

    ThermoMeter wc;
    ThermoMeter nappali;
    ThermoMeter halo;
    ThermoMeter konyha;
    Thermostat thermostat;

    @BeforeEach
    void init() {
        wc = new ThermoMeter("Toilet", 25);
        nappali = new ThermoMeter("Nappali", 22);
        halo = new ThermoMeter("Hálószoba", 21);
        konyha = new ThermoMeter("konyha", 26);
        thermostat = new Thermostat();
    }

    @Test
    void testThermostat() {
        thermostat.addThermometer(wc);
        thermostat.addThermometer(nappali);
        thermostat.addThermometer(halo);
        thermostat.addThermometer(konyha);
        System.out.println(thermostat.getRoomsToHeat());
        System.out.println(thermostat.getThermoMeters());

    }

}