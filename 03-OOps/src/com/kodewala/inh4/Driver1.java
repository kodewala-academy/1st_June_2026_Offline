package com.kodewala.inh4;

public class Driver1 {

	public static void main(String[] args) 
	{
		
      UserRegistration registration = new UserRegistration();
      
      registration.doRegistration("4321-1234-5678-0987");
      
      registration.doRegistration(4321, "0987-6543-32145");
	}

}
