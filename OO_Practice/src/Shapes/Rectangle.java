package Shapes;

public class Rectangle implements Shape {
	private double height;
	private double length;
	private double area;
	private double perimeter;
	
	public Rectangle()
	{
		//height = 1;
		//length = 1;
		this(1.0,1.0);
	}
	
	public Rectangle(double height, double length)
	{
		this.height = height;
		this.length = length;
		area = height * length;
		perimeter = 2 * (height + length);
	}
	
	public double getArea()
	{
		return area;
	}
	
	public double getPerimeter()
	{
		return perimeter;
	}
	
	
}
