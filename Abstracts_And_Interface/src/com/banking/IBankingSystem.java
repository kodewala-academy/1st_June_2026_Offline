package com.banking;

public interface IBankingSystem { // 15 years back

	public abstract void pay();
	public abstract void settle();
	public abstract void stopTxn();
	
	// from java 8 onwards, we can write default method.(OPTIONAL)
	public default void printPassBook() // should be implemented by rural bank only
	{
		System.out.println("IBankingSystem.printPassBook()");
	}
}
