package Numbers;

public class Fraction implements Number{
	private int numerator;
	private int denominator;
	private boolean sign;
	
	public Fraction()
	{
		numerator = 1;
		denominator = 1;
		sign = true;
	}
	
	public Fraction(int numerator, int denominator, boolean sign)
	{
		this.numerator = numerator;
		this.denominator = denominator;
		this.sign = sign;
	}
	
	public int getNumerator()
	{
		return numerator;
	}
	
	public void addition(Number otherNum)
	{
		Fraction second = (Fraction)otherNum;
		this.numerator += second.getNumerator();
	}
	
	public void subtraction(Number otherNum)
	{
		Fraction second = (Fraction)otherNum;
		this.numerator -= second.getNumerator();
	}
	
	public void display()
	{
		System.out.println("THe fraction is: " + numerator + "/" + denominator);
	}
}
