package com.kodewala;

public abstract class PaymentSystem  // declare abstract and normal metogs
{

	PaymentSystem()
	{
		super();
		System.out.println("PaymentSystem.PaymentSystem()......");
	}
	
	
  public abstract void doTxn() ;    // what
  public abstract void suspendTxn();
  
  public void sendSms() // providing default functionalities 
  {
	  
  }
  
}

class UPIPayment extends PaymentSystem
{
	@Override
	public void doTxn() 
	{
		// How ?
	}

	@Override
	public void suspendTxn() {
	
		//
		
	}
	
	UPIPayment()
	{
		super();
		System.out.println("UPIPayment.UPIPayment()");
	}
}


