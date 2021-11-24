package staticattrmeth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetTest {

    @Test
    void testAddDog () {
        Vet vet = new Vet();
        Dog morzsi = new Dog("Morzsi", 5, Species.BEAGLE);
        Dog stefi = new Dog("Stefi", 3, Species.GERMAN_SHEPHERD);
        vet.addDog(morzsi);
        assertEquals(1, vet.getDogList().size());
        vet.addDog(stefi);
        assertEquals(2, vet.getDogList().size());
        assertEquals(2, vet.getDogList().get(1).getCodeNumber());
    }

}