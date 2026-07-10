package com.sbi.accounts;

public class Driver {

	public static void main(String[] args) {

		Account account = new Account();

		account.approveAccount();

		SavingAccount savingAccount = new SavingAccount();
		savingAccount.openAccount();
		savingAccount.approveAccount();
		int interest = savingAccount.calculatInterest(1000);
		System.out.println("Driver.main() --> " + interest);
	}

}
