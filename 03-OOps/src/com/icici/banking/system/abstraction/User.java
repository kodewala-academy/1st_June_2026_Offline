package com.icici.banking.system.abstraction;

// Anurag
public class User {
	public static void main(String[] args) {
		PaymentProcessor paymentProcessor = new PaymentProcessor();

		int balance = paymentProcessor.checkBalance("uid123", "pwd123");
		
	/*
	 * paymentProcessor.connectWithDB(); paymentProcessor.getPasswordByUserID();
	 * paymentProcessor.doValidate(); int balance =
	 * paymentProcessor.getBalanceFromDB();
	 */
		
		
		System.out.println(balance);
	}
}
