import java.util.ArrayList;

public class Game {
    public Team team;
    public ArrayList<Goal> goal;

    public Game(Team team, ArrayList<Goal> goal){
        this.team = team;
        this.goal = goal;
    }

    public ArrayList<Goal> addGoals(Goal goal,ArrayList<Goal> goals){
        goals.add(goal);
        return goals;
    }

    public void displayGame(Game homeTeam, Game awayTeam){
        System.out.println("Home Team " + homeTeam.team.getTeamName());
        System.out.println("Away Team " + awayTeam.team.getTeamName());
        for (Goal goal:this.goal
             ) {
            System.out.print(this.team.getTeamName() + " ");
            goal.displayPlayer();
            System.out.println(" " + goal.getTimeScored());
        }
    }

    public void displayGame(){
        for (Goal goal:this.goal
                ) {
            System.out.print(this.team.getTeamName() + " ");
            goal.displayPlayer();
            System.out.println(" " + goal.getTimeScored());
        }
    }
}
