package com.zepto;

public class Driver {

	
	public static void main(String[] args) 
	{
		System.out.println("Driver.main() START ");
		
		String name = args[0]; 

	    System.out.println(" Length of string is "+name.length()); // null.length() --> NullPointerException
		
		int amount = 100;
		
		int result = amount/0; // ArithmeticException
		
		Driver driver = new Driver();
		driver.doSomething();
		
		System.out.println("Driver.main() END ");
	}
	
	
	private void doSomething()
	{
		System.out.println("Driver.doSomething() START ");
		System.out.println("Driver.doSomething() doing someting");
		System.out.println("Driver.doSomething() END ");
	}

}
