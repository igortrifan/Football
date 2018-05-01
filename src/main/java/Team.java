import java.util.ArrayList;

public class Team {
    public String teamName;
    public ArrayList<Player> players;

    public Team(final String teamName,final ArrayList<Player> players) {
        this.teamName = teamName;
        this.players = players;
    }

    public String getTeamName() {
        return teamName;
    }

    public ArrayList<Player> addPlayers(Player player, ArrayList<Player> teamPlayers) {
        teamPlayers.add(player);
        return teamPlayers;
    }
    
    public void displayTeam(){

            for (Player player :
                    this.players) {
                System.out.print(this.teamName + " ");
                System.out.println(player.getFirstName() + " " + player.getLastName() + " " + player.getAge());
            }

    }
}