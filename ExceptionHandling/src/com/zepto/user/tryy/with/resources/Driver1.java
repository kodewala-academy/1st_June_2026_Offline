package com.zepto.user.tryy.with.resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Driver1 {

	public static void main(String[] args) {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.xtx"));) 
		{
			System.out.println("Driver.main()");
		}
		catch (NullPointerException | ArithmeticException | IOException e) // Exception should not be related.
		{
			e.printStackTrace();
		} 
		

	}

}
