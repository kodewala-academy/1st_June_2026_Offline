package com.kodewala.strings6;

public class Driver {

	public static void main(String[] args)
	{
		String s1="Hello"; // Scp - xyz
		
		String s2 = new String("Hello").intern(); // Heap abc
		
		System.out.println(s1 == s2); // false
		
		String s10 = "Kodewala"; // Kodewala in scp 
		s10.concat(" Academy"); //  Academy in scp + Kodewala Acadmey in Heap

	}

}
