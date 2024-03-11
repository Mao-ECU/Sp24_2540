package FileIO;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class combineFiles {

	public static void main(String[] args) {
		String outFile = "files/outFile.txt";
		PrintStream inStream = null;
		Scanner outStream = null;
		
		try
		{
			inStream = new PrintStream(new File(outFile));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Cannot open input file ");
			System.exit(0);
		}
		int lineNum = 1;
		
		for(int i = 0; i < args.length; i++)
		{
			File inFile = new File("files/" + args[i]);
			
			try
			{
				outStream = new Scanner(inFile);
			}
			catch(FileNotFoundException e)
			{
				System.out.println("Cannot open the output file");
				System.exit(0);
			}
			
			while(outStream.hasNextLine())
			{
				String aLine = outStream.nextLine();
				inStream.println(lineNum + " " + aLine);
				lineNum++;
			}
			outStream.close();
		}
		inStream.close();
	}

}
