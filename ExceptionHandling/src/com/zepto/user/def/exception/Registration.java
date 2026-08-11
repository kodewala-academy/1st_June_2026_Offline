package com.zepto.user.def.exception;

public class Registration {
	public boolean doRegistration(String _userId) throws UserAlreadyExistsException
	{
		System.out.println("Registration.doRegistration() START.....");
		boolean status = false;
		boolean isUserExists = true;
		// check the user id against database if not then insert the record else inform
		// caller that user is already available in db.
		if (!isUserExists)
		{
			System.out.println(" Registering the user  "+_userId);
			
			// insert the record to database
			status = true;
		}
		else 
		{
			System.out.println(" User is available in db..."+_userId);
			// inform caller --> Throwing user defined exception
			throw new UserAlreadyExistsException(" User is already registered : " + _userId);
		}
		
		return status;
	}
}
