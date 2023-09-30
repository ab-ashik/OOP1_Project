package FileReadWrite;

import java.lang.*;
import java.io.*;

public class FileIO
{
	private File file;				
	private FileWriter writer;	
	private FileReader reader;		
	private BufferedReader bfr;		
	
	
	public void writeSales(String s)
	{
		try
		{
			file = new File("I:/STATIONARY MANGEMENT SYSTEM/SalesReport.txt");	
			file.createNewFile();					
			writer = new FileWriter(file, true);
			writer.write(s+"\r"+"\n");				
			writer.flush();							
			writer.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void readSales()
	{
		
		
		try
		{
			reader = new FileReader(file);			
			bfr = new BufferedReader(reader);		
			String text="", temp;					
			
			while((temp=bfr.readLine())!=null)		
			{
				text=text+temp+"\n"+"\r";			
			}
			
			System.out.println(text);			
			reader.close();						
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
}