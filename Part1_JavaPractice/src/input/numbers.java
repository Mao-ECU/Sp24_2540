package input;

import java.util.Scanner;

public class numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num; // hold input value
		int largest = 0, smallest = 0, sum = 0, count = 0;
		double average = 0;
		
		System.out.println("Please enter some integers, ended with a negative number: ");
		num = input.nextInt();
		
		while(num >= 0)
		{
			// 
			sum += num;
			
			//update count
			count++;
			
			//update largest
			if(count == 1) // first entering
			{
				largest = num;
			}
			else // not first enter
			{
				if(num > largest)
				{
					largest = num;
				}
			}
			
			//update smallest
			if(count == 1)
			{
				smallest = num;
			}
			else
			{
				if(num < smallest)
				{
					smallest = num;
				}
			}
			
			num = input.nextInt();
		}
		average = (double)sum / count;
		
		System.out.println("The largest value is " + largest);
		System.out.println("The smallest value is " + smallest);
		System.out.println("The average value is " + average);


	}

}
