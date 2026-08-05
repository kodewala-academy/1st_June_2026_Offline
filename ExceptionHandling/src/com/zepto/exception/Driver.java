package com.zepto.exception;

import com.zepto.user.User;

/**
 * @author Daksh
 */
public class Driver {

	public static void main(String[] args) {

		User user = new User();
		String userId=null;;
		try {
			userId = user.createUser(null, "Test%$#@");
		} catch (Exception e) {
			System.out.println("Message : "+e.getMessage());
			// may set default user id 
		}

		System.out.println(" User id is ::: " + userId);
	}

}
