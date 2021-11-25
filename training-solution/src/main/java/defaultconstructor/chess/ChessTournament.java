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
        int teamsSize = (playersRegistrated.size() + 1) / 2;
        System.out.println(teamsSize);
        System.out.println(playersRegistrated.size());
        int i;
        for (i = 0; i <= teamsSize-1; i++) {
                Player player1 = playersRegistrated.get(2*i);
                teams.get(i).setPlayerOne(player1);

                if (playersRegistrated.size() != 1 || playersRegistrated.size() != 3 || playersRegistrated.size() !=5 ) { //
                    try {
                        Player player2 = playersRegistrated.get(2*i+1);
                        teams.get(i).setPlayerTwo(player2);
                    }
                    catch (IllegalArgumentException iae) {
                        iae.printStackTrace();
                    }

                } else {
                    System.out.println("Ide már nem jutott játékos");
                }

        }
    }

    public void getTeams() {
        for (int i = 0; i < 1; i++) {
            System.out.println( teams.get(i).getPlayerOne().getName());
            System.out.println( teams.get(i).getPlayerTwo().getName());
        }
    }

}
