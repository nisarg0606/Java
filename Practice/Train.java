//train number, train name, dest, sorce, fair, time
//timeTable.txt
//1. instert
//2. seach
//3. exit
package Practice;
import java.io.*;
// import java.util.*;

class details
{
	void insert() throws Exception
	{
		FileWriter f=new FileWriter("TimeTable.txt",true);
		BufferedWriter b=new BufferedWriter(f);
		
		InputStreamReader i =new InputStreamReader(System.in);
		BufferedReader b1= new BufferedReader(i);
		
		
		
		System.out.println("Enter Train number:- ");
		String str1 = b1.readLine();
		System.out.println("Enter Train Name:- ");
		String str2 = b1.readLine();
		System.out.println("Enter departure station:- ");
		String str3 = b1.readLine();
		System.out.println("Enter Arival station:- ");
		String str4 = b1.readLine();
		System.out.println("Enter Fair:- ");
		String str5 = b1.readLine();
		System.out.println("Enter departure Time:- ");
		String str6 = b1.readLine();
		b.write(str1);
		b.write(' ');
		b.write(str2);
		b.write(' ');
		b.write(str3);
		b.write(' ');
		b.write(str4);
		b.write(' ');
		b.write(str5);
		b.write(' ');
		b.write(str6);
		b.write(' ');
		b1.close();
		i.close();
		b.close();	
	}
	void search() throws Exception
	{
		FileReader f =new FileReader("TimeTable.txt");
		BufferedReader b2= new BufferedReader(f);
		InputStreamReader i =new InputStreamReader(System.in);
		BufferedReader b1= new BufferedReader(i);
		
		// String words[]=null;
		String line; 
		
		System.out.println("Enter a word to find:- ");
		String s = b1.readLine();
		//System.out.println("Train number||Train Name||departure station||Arival station||Fair departure||Time");
		int k=0;
		while((line = b2.readLine()) != null) 
		{
			int count=0;
			if(line.contains(s)) //check if string is present
			{
				count++;
			}
			if(count!=0)
			{
				System.out.println(line);
				k++;
			}
		}
		if(k==0)
			System.out.println("||Not Present||");
		
		b1.close();
		i.close();
		b2.close();
		f.close();
		
	}
	
}
class railways
{
	public static void main(String arg[]) throws Exception
	{
		details d = new details();
		
		InputStreamReader j =new InputStreamReader(System.in);
		BufferedReader b1= new BufferedReader(j);
		
		String i;
		
		do
		{
			System.out.println("press ");
			System.out.println("1. for insert");
			System.out.println("2. for search");
			System.out.println("3. for exit");
			
			System.out.println("Enter your choice:-");
			i = b1.readLine();
			
			switch(i)
			{
				case "1":
					d.insert();
					break;
				case "2":
					d.search();
					break;
				case "3":
					System.out.println("Exiting......");
                    System.exit(0);
                    break;
				default:
					System.out.println("||Enter valid number||");
					
			}
		}while(i!="3");
		b1.close();
		j.close();
		
	}
}