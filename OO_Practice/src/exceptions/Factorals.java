package exceptions;

import java.util.Scanner;

public class Factorals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new 
		int n;
		
		try {
			if(n < 0)
			{
				throw new DivideByZeroException();
			}
			// calculate n!
		}
		catch(DivideByZeroException e)
		{
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		
	}

}
