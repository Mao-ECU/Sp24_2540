package practice1;

public class prime {

	public static void main(String[] args) {
		int n = 100;
		printPrime(n);

	}
	
	public static void printPrime(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			boolean flag = true;
			for(int j = 2; j <= i/2; j++)
			{
				if(i % j == 0)
				{
					flag = false;
					break;
				}
			}
			if(flag == true)
			{
				System.out.print(i + " ");
			}
		}
	}

}
