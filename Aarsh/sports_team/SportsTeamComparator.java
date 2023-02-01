package aarsh.sports_team;

import java.util.Comparator;

public class SportsTeamComparator implements Comparator<SportsTeam> {
    private int sortBy;
    private char sortOrder;

    // 1. wins
    // 2. losses
    // 3. Goal Difference
    public SportsTeamComparator() {
        sortBy = 1;
        sortOrder = 'D';
    }

    public SportsTeamComparator(int sortBy, char sortOrder) {
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
    }

    public void setSortBy(int sortBy) {
        this.sortBy = sortBy;
    }

    public void setSortOrder(char sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public int compare(SportsTeam team1, SportsTeam team2) {
        if (sortOrder == 'A') {
            return compareAscending(team1, team2);
        } else if (sortOrder == 'D') {
            return compareDescending(team1, team2);
        } else {
            throw new IllegalArgumentException("Invalid sortOrder value");
        }
    }

    private int compareDescending(SportsTeam team1, SportsTeam team2) {
        switch (sortBy) {
            case 1:
                return team2.getWins() - team1.getWins(); // Descending order
            case 2:
                return team2.getLosses() - team1.getLosses(); 
            case 3:
                return team2.getGoalDifference() - team1.getGoalDifference(); // Ascending order
            default:
                throw new IllegalArgumentException("Invalid sortBy value");
        }
    }

    private int compareAscending(SportsTeam team1, SportsTeam team2) {
        // Collections.sort() uses ascending order by default
        // 1 means team1 is greater than team2
        // -1 means team1 is less than team2
        // 0 means team1 is equal to team2
        // If you want to sort in descending order, you can return the opposite of the above values
        switch (sortBy) {
            case 1:
                return team1.getWins() - team2.getWins(); // Ascending order
            case 2:
                return team1.getLosses() - team2.getLosses(); // Ascending order
            case 3:
                return team1.getGoalDifference() - team2.getGoalDifference(); // Ascending order
            default:
                throw new IllegalArgumentException("Invalid sortBy value");
        }
    }
}
