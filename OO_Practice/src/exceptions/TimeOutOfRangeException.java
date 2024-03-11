package exceptions;

public class TimeOutOfRangeException extends Exception{
	public TimeOutOfRangeException()
	{
		super();
	}
	
	public TimeOutOfRangeException(String message)
	{
		super(message);
	}
}
