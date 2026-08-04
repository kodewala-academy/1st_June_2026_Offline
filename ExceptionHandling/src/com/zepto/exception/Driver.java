package com.zepto.exception;

import com.zepto.user.User;
/**
 * @author Daksh
 */
public class Driver {

	public static void main(String[] args) {
		
		User user = new User();
		user.createUser("mohitt", "Test%$#@");

	}
	
	
	

}
