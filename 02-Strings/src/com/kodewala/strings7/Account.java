package com.kodewala.strings7;

class Test extends Object {

	final static int MIN_AMOUNT = 0; // constant --> object specific

	public static void doSomething() // child class can not override
	{
		System.out.println("Test.doSomething()");
	}

}

public class Account extends Test {

	public static void main(String[] args) {

	}

}
