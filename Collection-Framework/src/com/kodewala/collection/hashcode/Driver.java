package com.kodewala.collection.hashcode;

class Delivery
{
	
}

public class Driver {

	public static void main(String[] args) 
	{
	
		String s1 ="Hello"; // string object
		String s2 ="Hello";
		System.out.println(" Hash code  for s1 is : "+ s1.hashCode()); // 69609650
		System.out.println(" Hash code  for s2 is : "+ s2.hashCode()); // // 69609650
		
		System.out.println(" is s1 and s2 are equal? : "+ s1.equals(s2));
		
		Delivery d1 = new Delivery(); // 1829164700
		Delivery d2 = new Delivery(); // 1829164700
		
		System.out.println(" is d1 and d2 are equal? : "+ d1.equals(d2)); // false
		
		System.out.println(d1.hashCode() +" and "+d2.hashCode());
	}

}
