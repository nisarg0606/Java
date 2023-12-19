package aarsh.sports_team;

public class SportsTeam {
    private String teamName;
    private int wins;
    private int losses;
    private int goalDifference;

    public SportsTeam(String teamName, int wins, int losses, int goalDifference) {
        this.teamName = teamName;
        this.wins = wins;
        this.losses = losses;
        this.goalDifference = goalDifference;
    }

    public SportsTeam() {
    }

    public SportsTeam(String teamName, int wins, int losses) {
        this.teamName = teamName;
        this.wins = wins;
        this.losses = losses;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(int goalDifference) {
        this.goalDifference = goalDifference;
    }

    @Override
    public String toString() {
        return "teamName='" + teamName + '\'' + ", wins=" + wins + ", losses=" + losses + ", goalDifference="
                + goalDifference;
    }
}
