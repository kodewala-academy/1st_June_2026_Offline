package com.icici.bank;

public class Account {
	
	// hiding data by making fields private 
	private int balance;
	private String name;

	
	public Account(int balance, String name) {
		super();
		this.balance = balance;
		this.name = name;
	}

	// providing public setter if someone wants to modify the data
	public void deposit(int amount) 
	{
		if (amount > 0) 
		{
			balance = balance + amount;
		}
	}
	
	// providing public setter if someone wants to modify the data
	public void withdrawal(int amount)
	{
		if(amount <=balance)
		{
			balance = balance - amount;
		}
		else
		{
			System.out.println(" Balance is the enough!!! Call papa!");
		}
	}
	
	// providing public getter if someone wants to modify the data
	public int checkBalance()
	{
		return balance;
	}
}
