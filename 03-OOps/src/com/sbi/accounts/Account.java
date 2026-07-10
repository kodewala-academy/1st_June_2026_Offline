package com.sbi.accounts;

public class Account {

	// common attributes
	int balance;
	String name;
	String branchCode;
    private String userId; // this will not be available for child class.
    
	public void openAccount() {
		System.out.println("Account.openAccount()");
	}

	public void closeAccount() {
		System.out.println("Account.closeAccount()");
	}

	public void approveAccount() {
		System.out.println("Account.approveAccount()");
	}
}
