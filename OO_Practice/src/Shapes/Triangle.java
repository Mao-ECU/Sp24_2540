package Shapes;

public class Triangle implements Shape{
	private double sideA;
	private double sideB;
	private double sideC;
	private double area;
	private double perimeter;
	
	public Triangle()
	{
		this(1, 1, 1);
	}
	
	public Triangle(double sideA, double sideB, double sideC)
	{
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
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
