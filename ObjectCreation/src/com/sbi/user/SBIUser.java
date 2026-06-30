package com.sbi.user;

public class SBIUser {
	// instance variable or fields or attribute
	private String name;
	private String userId;
	private String pwd;
	private int balance;

	SBIUser() // constructor which does not expect any args
	{
		System.out.println(" i am in side SBIUser()");
	}

	SBIUser(String _name, String _userId, String _pwd, int _balance) {
		System.out.println("SBIUser.SBIUser(String _name, String _userId , String _pwd, int _balance)");
		this.name = _name;
		this.userId = _userId;
		this.pwd = _pwd;
		this.balance = _balance;
	}

	public static void main(String[] args) {
		System.out.println("SBIUser.main() START");

		SBIUser abhinav = new SBIUser("abhinav", "abhi1234", "test@12345", 10000); // Abhinav logged-in

		// ashish also logged in

		SBIUser ashish = new SBIUser("ashish", "ashish@12345", "mylastlove@12345", 20000);

		System.out.println("SBIUser.main() END");
	}
}
//...
