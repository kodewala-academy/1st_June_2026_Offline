package com.kodewala.strings4;

public class StringExp {

	public static void main(String[] args) {

		//
		String s1 = "Kodewala " + "Academy"; // only one object -->

		// String s1="Kodewala Academy"; in scp

		System.out.println(s1);

		String s2 = "Hello"; // scp
		String s3 = "World"; // scp

		String s4 = s2 + s3; // Heap(run time optimization --> StringBuilder to create object)

		String s5 = "HelloWorld"; // scp
		
		System.out.println(s5 == s4);
		System.out.println(s5 + " " + s4);
		System.out.println(s5.equals(s4));
	}

}
