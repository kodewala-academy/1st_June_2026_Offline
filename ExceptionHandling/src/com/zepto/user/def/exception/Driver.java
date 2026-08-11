package com.zepto.user.def.exception;

public class Driver {

	public static void main(String[] args) {
		
		Registration registration = new  Registration();
		
		try 
		{
			registration.doRegistration("donno1234");
		}
		catch (UserAlreadyExistsException e) {
			
			e.printStackTrace();
		}
		

	}

}
