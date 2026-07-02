package com.kodewala.strings2;

public class Driver {

	public static void main(String[] args) {
		
		String s1 = "Bangalore"; // SCP
		
		s1.concat(" India"); // India is scp and resulted new object will be in Heap
		
		
		
		String s2 = new String("Bangalore");
		
		System.out.println(s1==s2); // false
		System.out.println(s1.equals(s2)); // true
	
	
	}

}
