package com.icici.banking.system;

public class PhonePayPayment extends Payment 
{
	@Override
	public void doPayment() 
	{
		System.out.println("PhonePayPayment.doPayment().. doing phonepay...");
	}
}
