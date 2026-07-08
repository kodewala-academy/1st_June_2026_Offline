package com.icici.account;

public class Account {
	// all the data/variables should be private
	private int balance;

	// public method
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance)
	{
		if (balance > 0)  // allowing modification in controlled way 
		{
			this.balance = balance;
		}
	}

}
