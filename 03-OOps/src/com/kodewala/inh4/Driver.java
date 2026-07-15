package com.kodewala.inh4;

class Delivery {
	public void estimateTime(String src, String dest) {
		System.out.println("Delivery.estimateTime(String src, String dest)");
	}
}

class ExpressDelivery extends Delivery {


	public void estimateTime(String src, String dest) // Static methods are hidden in child class.
	{
		System.out.println("ExpressDelivery.estimateTime(String src, String dest)");
	}
}

class OneDayDelivery extends ExpressDelivery {

	public void estimateTime(String src, String dest) // Static methods are hidden in child class.
	{
		System.out.println("OneDayDelivery.estimateTime(String src, String dest)");
	}
}

public class Driver {

	public static void main(String[] args) {
		Delivery del = new OneDayDelivery(); // Parent class can refer child class object. // Situation 1

		// Compiler --> at the time of compilation, it will check estimateTime() exists
		// in Delivery or not.
		// running --> actual object is create --> ExpressDelivery class, jvm will call
		// the method of ExpressDelivery
		// Why runtime polymorphism -->
		del.estimateTime("Bangalore", "Delhi");
		
		del = new ExpressDelivery(); // Situation 2
		
		del.estimateTime("Bangalore", "Delhi");
		
	}
}
