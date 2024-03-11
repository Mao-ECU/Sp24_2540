package MidTerm;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Publication {
	private String ISBN;
	private String title;
	private String Author;
	private int publishYear;
	private double price;
	
	public Publication()
	{
		
	}
	
	public Publication(String ISBN, String title, String author, int publishYear, double price)
	{
		this.ISBN = ISBN;
		this.title = title;
		
	}
	
	public static void main(String[] args)
	{
		String ISBN, title, author;
		int publishYear;
		double price;
		
		// in your code, you need to read from the file for aLine
		String aLine = "A,978-0-13,Computer Systems,Randal Bryant,2016,158.00";
		String[] publication = aLine.split(",");
		ISBN = publication[1];
		title = publication[2];
		author = publication[3];
		publishYear = Integer.parseInt(publication[4]);
		price = Double.parseDouble(publication[5]);
		
		String fileName = "publications";
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
		
		while(input.hasNextLine())
		{
			String aine = input.nextLine();
			String[] bine = aine.split(",");
			//for(int i = 0; i < bine.length; i++)
			{
				System.out.println("---------------");
				if(bine[0].equals("A"))
				{
					System.out.println("Category: Book: ");
					System.out.println("ISBN: " + bine[1]);
					System.out.println("Title: " + bine[2]);
					System.out.println("Author: " + bine[3]);
					System.out.println("Publication Year: " + bine[4]);
					System.out.println("Price: " + bine[5]);
				}
				else
				{
					System.out.println("Category: Journal: ");
					System.out.println("ISBN: " + bine[1]);
					System.out.println("Title: " + bine[2]);
					System.out.println("Publication Year:  " + bine[3]);
					System.out.println("Volume:" + bine[4]);
					System.out.println("Price: " + bine[5]);
				}
			}
			
		}input.close();
	}
}
