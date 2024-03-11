package FileIO;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.File;

public class readFile2 {

	public static void main(String[] args) {
		File output = new File("out2.txt");
		PrintStream outStream = null;
		try
		{
			outStream = new PrintStream(output);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Cannot open file: " + output);
			System.exit(0);
		}
		
		outStream.println("Hello Java");
		outStream.println("Hello ECU");
		
		outStream.close();
	}

}
