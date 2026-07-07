package com.kodewala.strings7;

public class Driver {

	public static void main(String[] args) {
		String text = "swiss"; // char at index number 0

		char[] inputArr1 = text.toCharArray();
		
		
		for (int i = 0; i < inputArr1.length; i++) {
			char currentChar = inputArr1[i];
			
			if(text.indexOf(currentChar) == text.lastIndexOf(currentChar)) //
			{
				System.out.println(currentChar);
				break;
			}
			
		}
		
		System.out.println(text.length());
		
		
	//	System.out.println(text.charAt(6)); // A

		// convert the string to array

		char[] inputArr = text.toCharArray(); // convert the string to char array

		String arr[] = text.split(" ");

//		System.out.println(" total words are " + arr.length);

		for (int i = 0; i < 10; i++) {
	//		text = text.concat("" + i); // 10 new objects -> Heap
			// System.out.println(name);
		}

	}

}
