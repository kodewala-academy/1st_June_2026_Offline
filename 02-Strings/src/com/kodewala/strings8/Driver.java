package com.kodewala.strings8;

public class Driver {

	public static void main(String[] args) {
	//	String city = "Bangalore";

	//	city.concat(" India"); // new object created and no reference 

	//	System.out.println(city); // Bangalore
		
		StringBuffer  sb = new StringBuilder("Bangalore");
		
		sb.append(" India"); // --> Bangalore India --> No new object 
		
		
		sb.append(" 560076");
		System.out.println(sb); // 
	}

}
