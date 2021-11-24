package defaultconstructor.chess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChessTournament {

    private List<Team> teams;

    public ChessTournament() {
        this.teams = Arrays.asList(new Team(), new Team(), new Team());
    }

    public void addPlayersToTeams(List<Player> playersRegistrated) {
        int count = 0;
        for (int i = 0; i < playersRegistrated.size()-1; i += 2) {
                Player player1 = playersRegistrated.get(i);
                teams.get(count).setPlayerOne(player1);
                Player player2 = playersRegistrated.get(i+1);
                teams.get(count).setPlayerTwo(player2);
            count++;

        }
    }

    public void getTeams() {
        for (int i = 1; i < 2; i++) {
            System.out.println( teams.get(i).getPlayerOne().getName());
            System.out.println( teams.get(i).getPlayerTwo().getName());

        }
    }

}
