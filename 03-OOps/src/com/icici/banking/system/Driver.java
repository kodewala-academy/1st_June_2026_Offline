package com.icici.banking.system;

// client
public class Driver {

	public static void main(String[] args) 
	{
		PaymentProcessor processor = new PaymentProcessor();

	    Payment payment = new CardPayment();
	    
		processor.processPayment(payment);
	}

}
