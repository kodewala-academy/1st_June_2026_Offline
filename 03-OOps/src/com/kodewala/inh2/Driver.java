package com.kodewala.inh2;

class Product extends Object // Author - 1
{
	private String name;
	private String desc;
	
	public int displayProductDetails()
	{
		System.out.println("This is Generic Product..."); // functionality X
		return 20;
	}
}

class ElectronicProducts extends Product   // Author - 2
{
	private String size;
	private String color;
	
	@Override
	public int displayProductDetails()  // Overriding the parent class method inside child class
	{
		System.out.println(" This is Electronic product");  // Y functionality X
		return 30;
	}
	
}

public class Driver {

	public static void main(String[] args)
	{
		
		Object obj = ObjectFactory.getObject("ElectronicProducts"); //  Object obj = new Product();
		
		Product p = (Product) obj;
		p.displayProductDetails();
		
	}

}
