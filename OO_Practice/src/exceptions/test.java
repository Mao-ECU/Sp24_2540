package exceptions;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for(int i = 0; i < 10; i++)
		{
			arr[i] = i + 1;
		}
		int a = 0;
		
		try {
			if(a == 0)
			throw new DivideByZeroException("Divided by zero");
			if(a == 10)
			throw new Exception("A general exception");
		}
		
		catch(DivideByZeroException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
