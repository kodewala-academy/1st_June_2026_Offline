package com.sbi.user2;

class PaymentSystems extends Object
{
	public PaymentSystems(String status)
	{
		super();
	}
}

class Payment extends PaymentSystems
{
	public Payment() 
	{
		super("active");
	}
}

class UPIPayment extends Payment
{
	public UPIPayment() 
	{
	 
	}
}


public class Driver {

	public static void main(String[] args)
	{
		
		UPIPayment p1 = new UPIPayment();
		
		System.out.println(p1.hashCode());
	}

}
