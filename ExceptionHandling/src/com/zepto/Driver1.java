package com.zepto;

public class Driver1 {

	public static void main(String[] args) {
		System.out.println("Driver.main() START ");

		try 
		{
			String name = null;
			System.out.println("Driver1.main()   length : " + name.length());

			Driver1 driver1 = new Driver1();
			driver1.doSomething();
			
		} 
		
		catch (NullPointerException e) 
		{
			System.out.println(" Exception : Name is null");
			e.printStackTrace();
		}
		
		System.out.println("Driver.main() END ");
	}

	private void doSomething() {
		System.out.println("Driver.doSomething() START ");
		
		System.out.println("Driver.doSomething() doing someting");
		System.out.println("Driver.doSomething() END ");
	}

}
