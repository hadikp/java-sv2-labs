package constructoroverloading.advertisement;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BikeAdvertisementTest {

    @Test
    void testConstructonChain() {
        String description = "Az eladó bicigli nagyon szép.";
        List<String> extras = Arrays.asList("kerekek", "lánc", "fékek", "kormány");
        BikeAdvertisement bikeAd = new BikeAdvertisement(description, 11_200, extras, "csepel", "No23322");
        assertEquals("csepel", bikeAd.getBrand());
        assertEquals(11200, bikeAd.getPrice());
        assertEquals("No23322", bikeAd.getSerialNumber());
        System.out.println(bikeAd.getDescription());


    }

}