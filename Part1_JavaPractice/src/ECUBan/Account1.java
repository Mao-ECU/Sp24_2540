package ECUBan;

public class Account1 {
	private String ID;
	private String name;
	private double balance;
	
	public Account1(String ID, String name)
	{
		this.ID = ID;
		this.name = name;
		balance = 0;
		
		Bank.addAccount();
	}
	
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
		
		//totalBalance += num;
		Bank.updateBalance(num);
	}
	
	public void withdraw(double num)
	{
		if(balance < num)
		{
			System.out.println("Sorry you don't have enough balance");
			return;
		}
		balance -= num;
		//totalBalance -= num;
		Bank.updateBalance(num);
		System.out.println("YOur new balance is " + balance);
	}
	
	public static void main(String[] args)
	{
		//Account1 account = new Account1()
		//System.out.println(balance);
	}
}
