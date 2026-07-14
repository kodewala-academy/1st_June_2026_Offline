package com.kodewala.inh2;

public class ObjectFactory {

	//

	public static  Object getObject(String name) // Object obj = new Product(); OR Object obj = new ElectronicProducts();
	{
		Object obj = null;

		if (name.equalsIgnoreCase("Product")) {
			obj = new Product();
		} else if (name.equalsIgnoreCase("ElectronicProducts")) {
			obj = new ElectronicProducts();
		} else {
			System.out.println(" invalid type");

		}
		return obj;
	}

}
