package com.kodewala.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) 
	{

		try 
		{
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.txt"));
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		catch (IOException e) {
			
		}

	}

}
