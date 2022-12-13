package finalExam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Utils
{
	
	private final static char TERM_CHAR = '\0';
	
	/**
	 * Helper method for writing a string (as part of a record) to a random access file.  This method will be used
	 * as the opposite method for readStringFromRaf
	 * @param sVal	   This is the string to write
	 * @param nMaxSize  This is the maxium size of characters to write
	 * @param obRaf  Random Access file References
	 * @throws IOException
	 */
	public static void writeStringToRaf(String sVal, int nMaxSize, RandomAccessFile obRaf) throws IOException
	{
		//There is no method for writing a string to a random access file - we do however have writeByte which can be
		//used to writes bytes out.   Additionally there is a string method called getBytes which returns an array of bytes
		
		byte[] aWriteBytes = sVal.getBytes();
		
		int i=0;
		
		for (; i <Math.min(aWriteBytes.length, nMaxSize); i++)
		{
			obRaf.writeByte(aWriteBytes[i]);
		}
		
		for (; i<nMaxSize; i++)
		{
			obRaf.writeByte(TERM_CHAR);
		}
		
	}
	
	/**
	 * Utility file for reading a string from a file that was written by writeStringToRaf
	 * @param nMaxSize  Max chars to read 
	 * 	 * @param obRaf  Random access file
	 * @return
	 */
	public static String readStringFromRaf(int nMaxSize, RandomAccessFile obRaf) throws IOException
	{
		
		byte[] aReadBytes = new byte[nMaxSize];
		
		obRaf.read(aReadBytes);
		
		String sReturn = new String(aReadBytes);
		
		int nPos = sReturn.indexOf(TERM_CHAR);
		
		if (nPos != -1)
		{
			return sReturn.substring(0,nPos);
		}
		else
		{
			return sReturn;
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	public static String[] parseCSVLine(String sLine)
	{
		String sPattern = ",(?=([^\"]*\"[^\"]*\")*(?![^\"]*\"))";
		
		String[]  sFields = sLine.split(sPattern);
		for (int i = 0; i < sFields.length; i++) {
            // Get rid of residual double quotes
            sFields[i] = sFields[i].replace("\"", "");
        }
        return sFields;
	}
	
	
	/**
	 * This is going to return a list of objects obtained from reading a CSV specified by sPath
	 * The Function reference will be a function that will be used to map an indiviudal line from the CSV file into 
	 * a object of a particular type
	 * @param sPath
	 * @param funcRef
	 * @return
	 */
	public static List<Object> genCSVLoad(String sPath, Function<String, Object> funcRef)
	{
		List<Object> olReturn = null;
		
		try (BufferedReader br = new BufferedReader(new FileReader(sPath)))
		{
			olReturn = br.lines().skip(1).map(funcRef).collect(Collectors.toList());
		} 
		catch (FileNotFoundException e)
		{
			
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return olReturn;
		
	}
	
	
	public static  <T> List<T> genCSVLoad2(String sPath, Function<String, T> funcRef)
	{
		List<T> olReturn = null;
		
		try (BufferedReader br = new BufferedReader(new FileReader(sPath)))
		{
			olReturn = br.lines().skip(1).map(funcRef).collect(Collectors.toList());
		} 
		catch (FileNotFoundException e)
		{
			
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return olReturn;
	}
	
	
	
	
	
	
	
	
	
	

}
