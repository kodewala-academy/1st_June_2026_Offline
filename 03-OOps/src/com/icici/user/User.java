package com.icici.user;

import com.icici.account.Account;

public class User {

	public static void main(String[] args) {

		Account account = new Account();

		//account.balance=-23573634;
		
		System.out.println(" Before modification "+ account.getBalance());

		// X
		account.setBalance(-23573634); // directly setting or modifying the balance

		System.out.println(" after modification "+account.getBalance());
	}

}
