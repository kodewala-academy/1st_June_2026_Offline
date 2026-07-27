package com.kodewala.payment.inf4;

public class Driver {

	public static void main(String[] args) {

		MyInterface myInterface = (x, y) -> 
		{
			int sum = x + y;
			return sum;
		};

		int result = myInterface.doCalc(4, 10);
		System.out.println(result);

	}

}
