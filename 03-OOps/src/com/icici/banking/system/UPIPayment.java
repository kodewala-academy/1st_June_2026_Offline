package com.icici.banking.system;

public class UPIPayment extends Payment {

	@Override
	public void doPayment() 
	{
		System.out.println("UPIPayment.doPayment()... doing upi payment");
	}
}
