package exceptions;

import java.util.Scanner;

public class TimeConvert {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int hour, minute;
		
		
		for(int i = 0; i < 3; i++)
		{
			try
			{
				hour = keyboard.nextInt();
				minute = keyboard.nextInt();
				timeTo12(hour, minute);
				break;
			}
			catch(TimeOutOfRangeException e)
			{
				if(i < 2)
				{
					System.out.println(e.getMessage());
					System.out.println("Please try again");
				}
				else
				{
					System.out.println("Wrong time range, system quiting....");
					System.exit(0);
				}
			}
		}

	}
	
	public static void timeTo12(int hour, int minute) throws TimeOutOfRangeException
	{
		if((hour >= 24 || hour < 0) || (minute >=60 || minute < 0))
		{
			throw new TimeOutOfRangeException("Time out of Range");
		}
		if(hour > 12)
		{
			hour -= 12;
		}
		System.out.println("The time in 12-hour format is: " + hour + ":" + minute);
	}

}
