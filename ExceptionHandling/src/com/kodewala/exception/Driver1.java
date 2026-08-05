package com.kodewala.exception;

public class Driver1 {

	public static void main(String[] args) {
		
		Driver1 driver1 = new Driver1(); // static loading
		
		try 
		{
			Class.forName("com.kodewala.exception.Order"); // dynamic class loading
		} 
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		} 

	}

}
