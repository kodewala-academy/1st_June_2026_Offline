package com.kodewala.collection.fw1;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args)
	{
	  // I want to store String object(Employee names sachin)	

		// 1. Create a collection object(Creating container which will store the employee name)
		
		ArrayList<String> employeeNames = new ArrayList<String>(100); // Creating an array with initial capacity
		
		// 2. Add an elements(employee names)
		
		employeeNames.add("sachin");
		employeeNames.add("vasu");
		employeeNames.add("sandeep");
		employeeNames.add("sandeep");
		employeeNames.add("sandeep");
		employeeNames.add("vivek");
		employeeNames.add("vikash");
		employeeNames.add("krishna");
		employeeNames.add("vikash");
		employeeNames.add("krishna");
		employeeNames.add("ajay");
		// print it
	//	System.out.println(employeeNames); 
		
		for(int index=0; index <employeeNames.size(); index++)
		{
			String name = employeeNames.get(index);
			if (name.startsWith("s"))
			{
			System.out.println(name);
			}
		}
		System.out.println("Driver.main()..............................");
		// for each
		/*
		 * for(String name : employeeNames ) { System.out.println(name); }
		 */
	}

}
