package Shapes;

public class Circle implements Shape {
	
	private double radius;
	private double area;
	private double perimeter;
	
	public Circle()
	{
		this(1);
	}
	
	public Circle(double r)
	{
		radius = r;
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
