package com.sbi.user1;

public class Account
{
	private String name; // fields OR Attribute OR Data OR Variables
	private int balance; // fields OR Attribute OR Data OR Variables

	Account() 
	{
		// 1 st line of constructor 
		this("sanjay", 3000); // calling the Account class constructor 
        // new Account ("sanjay", 3000)
	}

	Account(String _name, int _balance) 
	{
		super(); // Object class constructor 
		this.name = _name;
		this.balance = _balance;
	}

	Account(int _balance, String _name) 
	{
		this.name = _name;
		this.balance = _balance;
	}
	

}
