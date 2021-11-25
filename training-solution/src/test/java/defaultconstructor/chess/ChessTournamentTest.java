package defaultconstructor.chess;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ChessTournamentTest {

    Player peter;
    Player jozsi;
    Player janos;
    Player erika;
    Player kati;
    Player bali;

    @BeforeEach
    void init() {
        peter = new Player();
        peter.setName("Péter");peter.setEmail("peter@gmail.com");
        jozsi = new Player();
        jozsi.setName("József");jozsi.setEmail("jozsi@gmail.com");
        janos = new Player();
        janos.setName("János");janos.setEmail("jancsi@gmail.com");
        erika = new Player();
        erika.setName("Erika");erika.setEmail("eri@gmail.com");
        kati = new Player();
        kati.setName("Kati");kati.setEmail("kati@gmail.com");
        bali = new Player();
        bali.setName("Balázs");bali.setEmail("bali@gmail.com");
    }

    @Test
    void testAddPlayersToTeam () {
        ChessTournament chessTour = new ChessTournament();
        chessTour.addPlayersToTeams(Arrays.asList(peter, jozsi, janos));

        chessTour.getTeams();

    }

}