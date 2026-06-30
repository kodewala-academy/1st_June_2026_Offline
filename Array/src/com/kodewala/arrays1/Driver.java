package com.kodewala.arrays1;

public class Driver {

	public static void main(String[] args) {

		int numbers[] = { 5234, -74, 41234, 879, -98707, 5787, -746, 4132 }; // 10k
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(" executing....");
			int number = numbers[i];
			if(number <0)
			{
				System.out.println(" Given array is -ve");
				break; // exit from the loop / block
			}
			
		}
	}

}
