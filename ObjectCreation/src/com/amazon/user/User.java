package com.amazon.user;

public class User {

	private String userName;
	private String userId;

	private String mobile;
	private String email;
	
	
	static 
	{
		System.out.println("User - static block "); // this will get executed just after loading the class
	}
	
	// IIB
	
	{
		System.out.println("User IIB");
	}

	public User(String _userId) {
		this("guest user", _userId, "0000000000", "abc@xyz.com"); // setting mandatory fields
		// 2nd line  - call to IIB 
		System.out.println("User.User() - 1");
	}

	public User(String userName, String userId, String mobile, String email) {
		super();
		// call to IIB
		System.out.println("User.User() - 2");
		this.userName = userName;
		this.userId = userId;

		this.mobile = mobile;
		this.email = email;
	}
	
	public static void main(String[] args) {
		System.out.println("User.main()");
		User ankit = new User("eqrtet-wertret-tretqert-tertqert");
		User ram = new User("eqrtet-wertret-tretqert-ttwert");
	}

}
