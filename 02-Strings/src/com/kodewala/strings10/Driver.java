package com.kodewala.strings10;

public class Driver {

	public static void main(String[] args) {
		
		QueryConstructor queryConstructor = new QueryConstructor();
		String query =  queryConstructor.constructQuery(null, 0);
		System.out.println(query);
	}

}
