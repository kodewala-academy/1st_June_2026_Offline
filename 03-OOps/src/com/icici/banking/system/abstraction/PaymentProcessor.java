package com.icici.banking.system.abstraction;

public class PaymentProcessor {
	
	// exposing the required.
	
	public int checkBalance(String userId, String pwd) {
		// connect with DB
		// Get the user and password from db
		// Validate it
		// check the balance
		// return the response
		connectWithDB();
		getPasswordByUserID();
		doValidate();
		displayMonthyAVG();
		int balance = getBalanceFromDB();
		return balance;
	}
  
	// hiding the core functionalities 
	private void connectWithDB() {
		System.out.println("PaymentProcessor.connectWithDB()");
	}

	private String getPasswordByUserID() {
		return "somepwd";
	}

	private boolean doValidate() {
		return true;
	}

	private int getBalanceFromDB() {
		return 1200;
	}
	
	
	private int displayMonthyAVG() {
		return 2300;
	}
	
}
