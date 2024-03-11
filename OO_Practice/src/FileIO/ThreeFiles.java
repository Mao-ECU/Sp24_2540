package FileIO;
import java.io.*;
import java.util.Scanner;

public class ThreeFiles {

	public static void main(String[] args) {
		
		//create an outpui scream 
		File outputFile = new File("files/newOut.txt");
		PrintStream outStream = null;
		
		try
		{
			outStream = new PrintStream(outputFile);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			System.exit(0);
		}
		
		Scanner inputStream = null;
		
		String[] fileNames = {"1.txt", "2.txt"};
		int lineNum = 0;
		
		for(int i = 0; i < fileNames.length; i++)
		{
			// create an input stream
			File file = new File("files/" + fileNames[i]);
			try
			{
				inputStream = new Scanner(file);
			}
			catch(FileNotFoundException e)
			{
				System.out.println("File not found");
				System.exit(0);
			}
			
			//read from input and write to output
			while(inputStream.hasNextLine())
			{
				String aLine = inputStream.nextLine();
				outStream.println(lineNum++ + " " + aLine);
				
			}
			
			inputStream.close();
			Syetem.outl.priunt("Finshed")
			
		}
		outStream.close();

	}

}
