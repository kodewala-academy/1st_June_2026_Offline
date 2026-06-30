package com.kodewala.arrays;

public class ArrayExp {

	public static void main(String[] args) {

		ArrayExp.storeElements();

	}

	public static void storeElements() {
		// Create an array (creating a container - size = 10 elements , type : int)

		int balance = 1000;

		// Creating an array of int which will hold 10 elements.

		int marks[] = new int[5];

		// int marks[] = { 5234, 74, 41234, 879, 98707, 5787, 746, 4132 };

		// add an elements to an array(Storage)
		marks[0] = 23;
		marks[1] = 45;
		marks[2] = 89;
		marks[3] = 22;
		marks[4] = 11;

		// How to read an elements

		int firstElement = marks[0];

		// Loop / iterate an array
		for (int i = 0; i < marks.length; i++) 
		{
			int mark = marks[i];
			
			if (mark >= 40) {
				System.out.println(mark);
			}

		}

	}

}
