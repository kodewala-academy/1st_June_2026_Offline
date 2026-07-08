package com.icici.bank;

public class ATM {

	public static void main(String[] args) 
	{
	 Account account = new Account(10000, "Rahul");
	 
	 
//	 System.out.println(" Check balance : "+ account.balance);
	 
	// System.out.println(" Check balance : "+ account.balance); // coz balance is private
	 
	 account.deposit(2000);
	 
	 
	 System.out.println(" Check balance : "+ account.checkBalance());
	 
	}

}
