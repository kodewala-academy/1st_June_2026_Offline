package com.kodewala.payment.inf1;

public class PersonalBakning implements IBanking {

	@Override
	public void payment() 
	{
		System.out.println("PersonalBakning.payment()");
	}

	@Override
	public void stopPayment() 
	{
		System.out.println("PersonalBakning.stopPayment()");
	}

	@Override
	public void suspendPayment() 
	{
		System.out.println("PersonalBakning.suspendPayment()");
	}

	@Override
	public void stopCheque() 
	{
		System.out.println("PersonalBakning.stopCheque()");
	}

}
