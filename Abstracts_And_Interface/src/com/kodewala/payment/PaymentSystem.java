package com.kodewala.payment;


public abstract class PaymentSystem  
{
    // setting up contract 
	 public abstract void pay(); // payment
	 public abstract void suspendPayment(); // canPay()
	 public abstract void stopPayment(); // stpPay()
	 
	 // added after one year.
	 public abstract void checkLimit(); // stpPay()
	 // common functionality
	 
	 public void checkStatus()
	 {
		 System.out.println("PaymentSystem.checkStatus()");
	 }
	 
	 public void checkStatus(int a)
	 {
		 System.out.println("PaymentSystem.checkStatus()");
	 }

}
