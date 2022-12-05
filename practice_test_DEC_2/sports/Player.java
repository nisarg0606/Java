package practice_test_DEC_2.sports;

public class Player
{

		private String name,team,position;
		private int age;
		
		public Player(String sName, String sTeam, String sPos, int nAge)
		{
			this.name= sName;
			this.team = sTeam;
			this.position  = sPos;
			this.age =nAge;
			
		}

		public String getName()
		{
			return name;
		}

		public String getTeam()
		{
			return team;
		}

		public String getPosition()
		{
			return position;
		}

		public int getAge()
		{
			return age;
		}
}
