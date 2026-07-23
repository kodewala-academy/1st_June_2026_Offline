package com.kodewala.payment.inf2;

public class UPI implements IPaymentSystem {

	@Override
	public void pay() 
	{
		System.out.println("UPI.pay()");
		
	}

	@Override
	public void settle() 
	{
		IPaymentSystem.calculatTxnFees(1000, 5);
		System.out.println("UPI.settle()");
		
	}

	@Override
	public void checkBalance()
	{
		System.out.println("UPI.checkBalance()");
	}
	
	
	
}
