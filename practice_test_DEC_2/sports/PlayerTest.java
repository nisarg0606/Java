package practice_test_DEC_2.sports;

// import practice_test_DEC_2.sports.Player;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayerTest
{

	public static void main( String[] args)
	{
		ArrayList<Player> lstPlayer  = loadFinalInfo();

		if(lstPlayer != null) {
			System.out.printf("%d", lstPlayer.size());

			// place your applicable code here
		}
		else {
			System.out.println("No records loaded");
		}

		// place your applicable code here
	}


	/**
	 * @param obList -> a list of players
	 * @return list of Strings with unique names of Teams
	 */
	public static ArrayList<String> getTeamList(ArrayList<Player> obList)
	{
		//Replace the following with appropriate Code
		return null;
	}


	/**
	 * @param obList
	 * @param sTeam
	 * @return list of players playing for the specified team.
	 * The list returned is ordered in the descending order of age of the player
	 */
	public static ArrayList<Player> getPlayersOnTeam(ArrayList<Player> obList, String sTeam)
	{
		//Replace the following with appropriate Code
		return null;
	}
	
	/**
	 * DO NOT CHANGE THIS METHOD IN ANY WAY AS IT IS A NECESSARY METHOD.
	 * Method will load a series of baseball players  in from a csv file.
	 * YOU DON"T HAVE TO KNOW HOW THIS WORKS (you will next semester) as this is just loading test values for the final.
	 * @return
	 */
	public static ArrayList<Player> loadFinalInfo()
	{
		Scanner obIn = null;
		ArrayList<Player> obList = new ArrayList<>();
		
		try
		{
			obIn = new Scanner(new File("src/finalExamSoln/players.csv"));
			
			 obIn.nextLine();
			 
			 
			 while (obIn.hasNextLine())
			 {
				 String[] saVals = obIn.nextLine().split(",");
				 
				obList.add(new Player(saVals[0], saVals[1], saVals[2], (int) Double.parseDouble(saVals[3])));
				
				
			 }
		
			
			
			
		}
		catch(FileNotFoundException exp)
		{
			System.out.println("File was not found");
			return null;
		}
		
		finally
		{
			if (obIn != null)
			{
				obIn.close();
			}
		}
		
		return obList;
		
		
	}


}
