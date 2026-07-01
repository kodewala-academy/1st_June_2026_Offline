package com.kodewala.strings;

public class Driver {

	public static void main(String[] args) {

		// Using literals
		// one of the way to create string object
		// Java checks if any object with content("Bangalore") exists
		// in String Constant Pool(SCP), if exists then no object created and
		// it start referring the existing object, if not then it create new Object
		// with content "Bangalore"
		String city = "Bangalore";
        String country = "India";
        String c = "bangalore";
        
        System.out.println(city == c); // true
        
	}

	
}
