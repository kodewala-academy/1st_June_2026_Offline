package com.kodewala.account;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Driver 
{
 public static void main(String[] args) throws FileNotFoundException, IOException 
 {
	 // Create a object 
	Account acc = new Account(12000, "donni", "DK123456", "BTM 2nd Stage");
	
	// TODO - send acc to network / write to file system / database.
	
	// We will write object to file system.
	
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("acc.ser")); 
	// Write the acc object to file(acc.ser) --> serialization 
	oos.writeObject(acc);
	System.out.println("Driver.main()... serialization done");
 }
}
