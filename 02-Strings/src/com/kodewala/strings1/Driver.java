package com.kodewala.strings1;

public class Driver {

	public static void main(String[] args) 
	{
	   String city = "Delhi";	// SCP and city is immutable 
	   city.concat("India");  // " India" will be created in SCP 
	                           // new object will be created.
    
	   
	   // two objects will be created. One in heap and one in scp
	   String temp = "Bangalore";
	   String s1 = new String(temp);
	   
	   String s10 = "Mumbai"; // scp
	   String s11 = "Mumbai"; // already "Mumbai" in scp so it wont create new object.
	   
	   System.out.println(s10 == s11); // true 
	   
	   String s13 = new String("Mumbai"); // Heap and one copy in scp
	   String s14 = new String("Mumbai"); // heap 
	   System.out.println(s13 == s14); // false 
   
	}

}
