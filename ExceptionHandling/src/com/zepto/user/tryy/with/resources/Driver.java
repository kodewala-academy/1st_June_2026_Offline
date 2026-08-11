package com.zepto.user.tryy.with.resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Driver {

	public static void main(String[] args) 
	{

		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.xtx"));)
		{
			 System.out.println("Driver.main()");
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		

	}

}
