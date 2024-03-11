package ooPractice;

import practice1.numbers;

public class circleDemo {

	public static void main(String[] args) {

		Circle cir1 = new Circle(10, "Green");
		//cir1.color
		
		//System.out.println("The color of cir 1 is " + cir1.getColor() );
		//Circle cir2 = new Circle();
		
		
		cir1.setRadius(5);
		cir1.setColor("Purple");
		System.out.println("The are of the circle is: " + cir1.getArea());
		
		numbers.number();
		
		//cir1.color = "Green";
		
	}

}
