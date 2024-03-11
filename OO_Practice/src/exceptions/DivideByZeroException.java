package exceptions;

public class DivideByZeroException extends Exception {
	public DivideByZeroException()
	{
		super("Divide by Zaro!");
	}
	
	public DivideByZeroException(String s)
	{
		super(s);
	}
}
