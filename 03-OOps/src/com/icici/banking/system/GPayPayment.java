package com.icici.banking.system;

public class GPayPayment extends Payment {

	@Override
	public void doPayment() 
	{
		System.out.println("GPayPayment.doPayment()... doing google pay payment");
	}
}
