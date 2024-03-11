package ECUBan;

/**
 * The bank account management system.
 * Account class to create individual account 
 */
public class Account {
	private String ID;
	private String name;
	private double balance;
	
	private static double rate = 0.1;
	private static int numAccount = 0;
	private static double totalBalance = 0;
	
	/**
	 * 
	 * @param ID ID for a coustomer
	 * @param name customer's name
	 */
	public Account(String ID, String name)
	{
		this.ID = ID;
		this.name = name;
		balance = 0;
		
		numAccount++;
	}
	
	/**
	 * return balance
	 * @return a double type balance
	 */
	public double getBalace()
	{
		return this.balance;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void deposit(double num)
	{
		balance += num;
		System.out.println("Your new balance is: " + balance);
		
		totalBalance += num;
	}
	
	public void withdraw(double num)
	{
		if(balance < num)
		{
			System.out.println("Sorry you don't have enough balance");
			return;
		}
		balance -= num;
		totalBalance -= num;
		System.out.println("YOur new balance is " + balance);
	}
	
	public static void setInterest(double newInter)
	{
		rate = newInter;
	}
	
	public static void main(String[] args)
	{
		for(int i = 0; i < args.length; i++)
        {
            System.out.println(args[i]);
        }
		/*
		Account[] allCustomers = new Account[5];
		
		for(int i = 0; i < 5; i++)
		{
			allCustomers[i] = new Account("A00" + i, "Name00" + i);
		}
		
		for(int i = 0; i < 5; i++)
		{
			allCustomers[i].deposit(i);
		}
		*/
	}
	
}
