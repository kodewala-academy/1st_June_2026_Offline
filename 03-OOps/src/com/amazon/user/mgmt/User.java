package com.amazon.user.mgmt;

public class User extends UserMgmt 
{

	public static void main(String[] args) {
		User user = new User();
		
		// User class is re-using the properties for its parent
		// class(UserMgmt)
		
		System.out.println(user.location);
		System.out.println(user.type);
		user.doSomething();

	}
}
