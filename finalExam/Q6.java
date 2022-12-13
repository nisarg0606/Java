package finalExam;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class Q6
{
	
	
	public static ArrayList<FinalPerson> obMasterList = new ArrayList<>();
	
	
	public static void main(String[] args)
	{
		obMasterList = loadFinalInfo();
		
		//Uncomment the following  to  see the full list of entries that are being loaded for you.
		//obMasterList.forEach(System.out::println);
		
		
	}
	
	public static int getCountForYear(ArrayList<FinalPerson> obList, int nYear)
	{
		//Replace the following with code that counts the number of entries in 
		//that indicate a birth year of nYear;
		return 0;
	}
	
	
	
	public static ArrayList<FinalPerson> getMostFruitful(ArrayList<FinalPerson> obList)
	{
		
		//Replace the following with code that will  return an ArrayList of all FinalPeople whose birthYear is the most popular birth year in the 
		//ArrayList of FinalPersons that is passed to it.
		return null;
	}
	
	
	public static void sortList(ArrayList<FinalPerson> obList)
	{
		
		//Introduce code that sort entries in obList sorted by Job Title.
		
		
	}


	private static Function<String, FinalPerson> mapToPerson =
			sLine -> {
				return new FinalPerson(Utils.parseCSVLine(sLine));

			};
	
	
	//Leave the following Alone!! it will load a series of test entries for you

	@SuppressWarnings("unchecked")
	public static ArrayList<FinalPerson> loadFinalInfo()
	{
		ArrayList<FinalPerson> obList = (ArrayList<FinalPerson>)Utils.<FinalPerson>genCSVLoad2("people.csv", mapToPerson);
		return obList;
	}

	
}
