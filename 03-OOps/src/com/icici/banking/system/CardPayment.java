package com.icici.banking.system;

public class CardPayment extends Payment {

	@Override
	public void doPayment() 
	{
		System.out.println("CardPayment.doPayment()... doing card payment");
		validateCard() ;
	}

	public void validateCard() 
	{
		System.out.println("CardPayment.validateCard()");
	}
}
