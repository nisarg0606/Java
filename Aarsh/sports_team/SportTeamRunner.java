package aarsh.sports_team;

import java.util.Arrays;
import java.util.Collections;

public class SportTeamRunner {
    public static void main(String[] args) {
        SportsTeam team1 = new SportsTeam("Team 1", 10, 5, 5);
        SportsTeam team2 = new SportsTeam("Team 2", 5, 10, 5);
        SportsTeam team3 = new SportsTeam("Team 3", 5, 5, 10);

        SportsTeam[] teams = { team1, team2, team3 };

        SportsTeamComparator comparator = new SportsTeamComparator();
        comparator.setSortBy(1);
        comparator.setSortOrder('D');
        Collections.sort(Arrays.asList(teams), comparator);
        // comparator.compare(team1, team2);
        // Arrays.sort(teams, comparator);
        System.out.println("Sorted by wins: ");
        for (SportsTeam team : teams) {
            System.out.println(team);
        }

        comparator.setSortBy(2);
        Collections.sort(Arrays.asList(teams), comparator);
        System.out.println("Sorted by losses: ");
        for (SportsTeam team : teams) {
            System.out.println(team);
        }

        comparator.setSortBy(3);
        Collections.sort(Arrays.asList(teams), comparator);
        System.out.println("Sorted by goal difference: ");
        for (SportsTeam team : teams) {
            System.out.println(team);
        }
    }
}
