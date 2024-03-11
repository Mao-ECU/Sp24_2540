package FileIO;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class AddNumbers {

	public static void main(String[] args) {
		String fileName = "files/numbers.txt";
		
		Scanner input = null;
		
		try
		{
			input = new Scanner(new File(fileName));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			System.exit(0);
		}
		
		int sum = 0;
		
		while(input.hasNextInt())
		{
			sum += input.nextInt();
		}
		
		System.out.println("The sum is " + sum);
		
		input.close();

	}

}
