/**
 * inside OOPractice package
 * to test javadoc
 */
package ooPractice;

/**
 * @author Xiaoli, Caddrik 
 * thanks for not letting me work during night!!!
 */
public class Circle {
	//attributes
	public double area;
	private double radius;
	private String color;
	
	//constructor
	/**
	 * constructor method, will take two parameters
	 * @param radius the radius of the circle
	 * @param color the color of the circle
	 */
	public Circle(double radius, String color)
	{
		this.radius = radius;
		this.color = color;
		area = 0;
	}
	
	
	//behaviors
	public void setColor(String newColor)
	{
		color = newColor;
	}
	
	public void setRadius(double r)
	{
		radius = r;
	}
	
	public double getArea()
	{
		return Math.PI * radius * radius;
	}
	
	public Circle mergeCircle(Circle cir2)
	{
		//this.area += cir2.getArea();
		area = this.getArea() + cir2.getArea();
		radius = Math.sqrt(area / Math.PI);
		return this;
	}
	
	public void merge(Circle cl2)
	{
		area += cl2.area;
		radius = Math.sqrt(area / Math.PI);
		System.out.println();
	}

}
