package com.sbi.accounts;

public class CurrentAccount extends Account {


	// this class will be able to re-use all the functionalities of its parent
	// class(Account)
	int rate = 0;

	public int calculatInterest(int amount) 
	{
		return amount * rate / 100;
	}
	public int forexCharges()
	{
		return 0;
	}
}
