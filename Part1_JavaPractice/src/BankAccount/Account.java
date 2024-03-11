package BankAccount;

public class Account {
	private String ID;
	private String name;
	private double balance;
	
	private static double interest = 0.08;
	private static int numAccount = 0;
	private static double totalBalance = 0;
	
	public Account(String ID, String name)
	{
		this.ID = ID;
		this.name = name;
		balance = 0;
		
		numAccount++;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void deposit(double num)
	{
		if(balance < num)
		{
			System.out.println("No enough money in your account!");
			return;
		}
		
		balance -= num;
		totalBalance -= num;
		System.out.println("Your new balance is " + balance);
	}
	
	public static void setInterest(double newInterest)
	{
		interest = newInterest;
	}

}
