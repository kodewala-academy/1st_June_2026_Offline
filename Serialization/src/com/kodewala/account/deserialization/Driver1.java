package com.kodewala.account.deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.kodewala.account.Account;

public class Driver1 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
	{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("acc.ser"));
		
		Account account = (Account) ois.readObject();
		// Object obj = new Account();
		// Account account = (Account) = obj;
		System.out.println("Driver1.main().... De-Serialization");
		
		System.out.println(" account " + account.getName() + " " + account.getLocation() + " " + account.getIfscCode() + " "+account.getBalance());
	}
}
