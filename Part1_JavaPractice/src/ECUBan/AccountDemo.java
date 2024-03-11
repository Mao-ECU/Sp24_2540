package ECUBan;

import java.util.Random;

public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Account a1 = new Account("001", "egrsd");
		Random rand = new Random();
		
		Account1[] accounts = new Account1[5];
		
		for(int i = 0; i < 5; i++)
		{
			accounts[i] = new Account1("00" + i, "customer0" + i);
		}
		
		for(int i = 0; i < 5; i++)
		{
			accounts[i].deposit(rand.nextInt(100));
		}
		
		for(int i = 0; i < 5; i++)
		{
			accounts[i].withdraw(rand.nextInt(80));
		}
		
		for(int i = 0; i < 5 ; i++)
		{
			System.out.println("Dear " + accounts[i].getName() + ", your balance is $" + accounts[i].getBalace());
		}
		
	}

}
