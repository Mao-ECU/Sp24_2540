package input;

import java.util.Scanner;

public class display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		int a, b;
		System.out.println("Please enter two integers: ");
		a = keyboard.nextInt();
		b = keyboard.nextInt();
		System.out.println("The two numbers you entered are: " + a + " and " + b);
		
		System.out.println("\nEnter two double numbers: ");
		double c, d;
		c = keyboard.nextDouble();
		d = keyboard.nextDouble();
		System.out.println("The two numbers you entered are " + c + " and " + d);
		
		System.out.println("ENter two words: ");
		String w1, w2;
		w1 = keyboard.next();
		w2 = keyboard.next();
		
		System.out.println("The two words are " + w1 + " " + w2);
		
		System.out.println("Enter two line: ");
		String s1, s2;
		s1 = keyboard.nextLine();
		s1 = keyboard.nextLine();
		s2 = keyboard.nextLine();
		System.out.println(s1);
		System.out.println(s2);
	}

}
