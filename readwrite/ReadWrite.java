package readwrite;

import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class ReadWrite
{
	private File f;				
	private FileWriter write;		
	private FileReader read;		
	private BufferedReader buffer;
	
	
	public void writeInFile(String s)
	{

		try
		{
			f = new File("readwrite/Member_Payment_Transaction.txt");	
			f.createNewFile();					
			write = new FileWriter(f, true);	
			write.write(s+"\r"+"\n");				
			write.flush();							
			write.close();					
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void writeInWorkout(String s1)
	{

		try
		{
			f = new File("readwrite/Workout_Schedule.txt");	
			f.createNewFile();					
			write = new FileWriter(f, true);	
			write.write(s1+"\r"+"\n");				
			write.flush();							
			write.close();					
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void readFromFile(String f1)
	{
		
		try 
     {
      Scanner myReader = new Scanner(new File("readwrite/"+f1));
      while (myReader.hasNextLine()) 
		{
          System.out.println(myReader.nextLine());
        }
       myReader.close();
      }  
     catch (FileNotFoundException e) 
      {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }
}
	
	
