package practice_test.sports;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayerTest {

	public static void main(String[] args) {
		ArrayList<Player> lstPlayer = loadFinalInfo();

		if (lstPlayer != null) {
			System.out.printf("%d", lstPlayer.size());

			// place your applicable code here
		} else {
			System.out.println("No records loaded");
		}
		System.out.println();
		// get team list
		ArrayList<String> lstTeam = getTeamList(lstPlayer);

		// display team list
		System.out.println("Team List");
		for (String team : lstTeam) {
			System.out.println(team);
		}
		System.out.println();

		// display player list for each team
		for (String team : lstTeam) {
			System.out.println("Team Name: " + team);
			for (Player player : lstPlayer) {
				if (player.getTeam().equals(team)) {
					System.out.println(player.getName());
				}
			}
			System.out.println();
		}
	}

	/**
	 * @param obList -> a list of players
	 * @return list of Strings with unique names of Teams
	 */
	/*
	 * b. Provide appropriate logic in the method getTeamList (). The method stub is
	 * already provided and should not be changed. This method must return an
	 * ArrayList<String> which contains the names of unique Teams from the
	 * ArrayList<Player>
	 */
	public static ArrayList<String> getTeamList(ArrayList<Player> obList) {
		ArrayList<String> teamList = new ArrayList<String>();
		for (Player player : obList) {
			if (!teamList.contains(player.getTeam())) {
				teamList.add(player.getTeam());
			}
		}
		return teamList;
	}

	/**
	 * @param obList
	 * @param sTeam
	 * @return list of players playing for the specified team.
	 *         The list returned is ordered in the descending order of age of the
	 *         player
	 */
	/*
	 * c. Provide appropriate logic in the method getPlayersOnTeam () which returns
	 * the ArrayList<Player> consisting of all players for the specified team. The
	 * list should be sorted in an order where the oldest player comes first
	 */
	public static ArrayList<Player> getPlayersOnTeam(ArrayList<Player> obList, String sTeam) {
		ArrayList<Player> players = new ArrayList<Player>();
		for (Player player : obList) {
			if (player.getTeam().equals(sTeam)) {
				players.add(player);
			}
		}
		players.sort((p1, p2) -> p2.getAge() - p1.getAge());
		return players;
	}

	/**
	 * DO NOT CHANGE THIS METHOD IN ANY WAY AS IT IS A NECESSARY METHOD.
	 * Method will load a series of baseball players in from a csv file.
	 * YOU DON"T HAVE TO KNOW HOW THIS WORKS (you will next semester) as this is
	 * just loading test values for the final.
	 * 
	 * @return
	 */
	public static ArrayList<Player> loadFinalInfo() {
		Scanner obIn = null;
		ArrayList<Player> obList = new ArrayList<>();

		try {
			obIn = new Scanner(new File("practice_test/sports/players.csv"));

			obIn.nextLine();

			while (obIn.hasNextLine()) {
				String[] saVals = obIn.nextLine().split(",");

				obList.add(new Player(saVals[0], saVals[1], saVals[2], (int) Double.parseDouble(saVals[3])));

			}

		} catch (FileNotFoundException exp) {
			System.out.println("File was not found");
			return null;
		}

		finally {
			if (obIn != null) {
				obIn.close();
			}
		}

		return obList;

	}

}
