package com.kodewala.payment.inf2;

public class CardPayment implements IPaymentSystem 
{
	
	@Override
	public void pay() {
		System.out.println("CardPayment.pay()");
		IPaymentSystem.calculatTxnFees(1000, 2);

	}

	@Override
	public void settle() {
		System.out.println("CardPayment.settle()");

	}
	
	
	
}
