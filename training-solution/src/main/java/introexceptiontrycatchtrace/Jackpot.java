package introexceptiontrycatchtrace;

public class Jackpot {
    public static void main(String[] args) {
        try {
            Winner winner = new Winner();
            String winnerText = String.format("A mai nyertes: %s", winner.getWinner());
            System.out.println(winnerText);
        }
        catch (NullPointerException npe) {
            System.out.println("A kisorsolt név nem megfelelő, sorsolj másikat!");
        }

    }
}
