package mid2;

import java.io.Serializable;

public class BetInfo implements Serializable

{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private double total;
	
	public BetInfo(String sName, double dTotal)
	{
		this.name = sName;
		this.total =  dTotal;
		
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	public String getName()
	{
		return name;
	}

	public double getTotal()
	{
		return total;
	}

	

	
	
	
	
	

}
