package com.kodewala.inh3;

class Customer
{
	private void showDetails() // private 
	{
		System.out.println("Customer.showDetails()");
	}
	// This method can be reused in the child classes OR if child classes want to modify the 
	// functionalities of this method, they are free to do so.
	 Object calcularePrice(String itemName, int price, boolean status) // X 
	{
		System.out.println("Customer.calcularePrice()");// biz logic 100+
		return new Object();
		
	}
	
	
}

	class GoldCustomer extends Customer
	{
		@Override // extra check
		public String calcularePrice(String item, int rate, boolean b)  // (order, type, number)
		{
			System.out.println("GoldCustomer.calcularePrice()");// X 
			return "something";
			
		}
	}


public class Driver1 {

	public static void main(String[] args) {
		

	}

}
