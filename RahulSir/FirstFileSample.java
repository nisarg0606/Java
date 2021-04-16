package RahulSir;

import java.io.*;//file,ioexception
import java.util.Scanner;
public class FirstFileSample
{
	public static void main(String[] args)throws IOException//dont forget for catching the file exception and checking 
	{
		Scanner myobj1 =  new Scanner(System.in);
		System.out.print("Enter the folder name here: ");
		String userName1 = myobj1.nextLine();

		File objDir1 = new File("E:\\java\\"+userName1);
		if(!objDir1.exists()){
			objDir1.mkdir();//like the terminal command
		}

		Scanner myobj2 = new Scanner(System.in);
		System.out.println("Enter the folder name here : ");
		String userName2 = myobj2.nextLine();

		File objDir2 = new File("c:\\"+userName1+"\\"+userName2);
		if(!objDir2.exists()){
			objDir2.mkdir();//like the terminal command
		}
		else{
			System.out.println("This folder already exists\n");
		}

		File objFile = new File("c:\\"+userName1+"\\"+userName2 +"\\"+"FileCreation_inception_folder.txt");//txt name
		if (!objFile.exists())//inbuilt self explanatory function
		{
			objFile.createNewFile();//iF NOT EXIST THEN CREATE
		}
		else{
			System.out.println("This file already exists\n");
		}
		myobj1.close();
		myobj2.close();
	}
}