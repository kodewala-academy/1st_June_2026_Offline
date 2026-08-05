package com.zepto.user;

/**
 * @author Suresh
 */
public class User {

	public String createUser(String userName, String password) throws Exception {
		System.out.println("Driver.createUser().. START");

		// Generate the user Id
		String userId = null;

		try {
			// Code to connect with Database
			// Open connection with Database...
			String country = "IN";
			System.out.println("User.createUser().... country is " + country);

			userId = userName.substring(0, 5) + "123"; // risky code - This code may throw exception

			// check if user already exists in db.

			System.out.println("Driver.createUser().. and generated user id : " + userId + " END");

		} catch (NullPointerException e) {
			System.out.println("User.createUser()... closing DB connections..."); // // 20 lines
			e.printStackTrace();
			System.out.println("user name is null");
			// New Exception objection and throw it.
			throw new Exception("user name is null");
		} catch (Exception e) {

		}

		finally {
			System.out.println("User.createUser().... closing the connection.....");
		}

		System.out.println("Driver.createUser() END");
		return userId;
	}
}
