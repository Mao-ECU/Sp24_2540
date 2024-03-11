package FileIO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class readFile {

	public static void main(String[] args) {
		
		String fileName = "out.txt";
		
		PrintWriter outStream = null;
		
		try
		{
			outStream = new PrintWriter(fileName);
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		outStream.println("Hello Java");
		outStream.println("Hello ECU");
		outStream.print("word 1 ");
		outStream.print("word 2");
		
		outStream.close();
		
	}

}
