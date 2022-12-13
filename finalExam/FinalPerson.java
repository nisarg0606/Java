package finalExam;

import java.io.Serializable;

public class FinalPerson implements Serializable
{
	
	private String firstName,lastName, gender,jobTitle;
	private int birthYear;
	
	public FinalPerson(String[] saVals)
	{
		this.firstName= saVals[0];
		this.lastName = saVals[1];
		this.gender = saVals[2];
		String[] sDates = saVals[3].split("-");
		this.birthYear = Integer.parseInt(sDates[0]);
		this.jobTitle = saVals[4];
		
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public String getGender()
	{
		return gender;
	}

	public int getBirthYear()
	{
		return this.birthYear;
		
	}

	public String getJobTitle()
	{
		return jobTitle;
	}
	
	
	@Override 
	public String toString()
	{
		return String.format("%s,%s\tgender: %s\tBirth Year: %d\tJob: %s", lastName,firstName,gender,birthYear,jobTitle);
		
	}
	

}
