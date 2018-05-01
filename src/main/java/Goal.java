public class Goal {
    public Player player;
    public Team team;
    public double timeScored;


    public double getTimeScored() {
        return timeScored;
    }

    public Goal(final Player player, final Team team, final double timeScored) {
        this.player = player;
        this.team = team;
        this.timeScored = timeScored;
    }

    public void displayPlayer(){
        System.out.print(player.getFirstName() + " " + player.getLastName() + " " + player.getAge());
    }
}
