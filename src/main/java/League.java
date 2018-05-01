import java.util.ArrayList;

public class League {
    public static void main(String [ ] args)
    {
        ArrayList<Player> players1 = new ArrayList<Player>();
        ArrayList<Player> players2 = new ArrayList<Player>();

        ArrayList<Goal> goal1 = new ArrayList<Goal>();
        ArrayList<Goal> goal2 = new ArrayList<Goal>();

        Team team1 = new Team("Red", players1);
        Team team2 = new Team("Blue", players2);

        Game homeTeam = new Game(team1,goal1);
        Game awayTeam = new Game(team2,goal2);

        team1.players = team1.addPlayers(new Player("Igor","Trifan",20), players1);
        team2.players = team2.addPlayers(new Player("Valeriu", "Seremet", 21),players2);

        team1.displayTeam();
        team2.displayTeam();

        homeTeam.goal = homeTeam.addGoals(new Goal(players1.get(0),team1,32.21),goal1);
        awayTeam.goal = awayTeam.addGoals(new Goal(players2.get(0),team2,54.32),goal2);

        awayTeam.displayGame(homeTeam,awayTeam);
        homeTeam.displayGame();

    }
}
