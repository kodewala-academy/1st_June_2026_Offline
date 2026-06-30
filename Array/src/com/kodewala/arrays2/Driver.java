package com.kodewala.arrays2;

public class Driver {

	public static void main(String[] args) {

		String products[] = { "iphone16", "", "iphone17", "iphone18", "", "sansungs20" }; // 100k

		// processing --> convert the products to upper case (iphone16 --> IPHONE16)
		
		for (int i = 0; i < products.length; i++) {
			
			String product = products[i];
			
			if(product.isEmpty()) // true if product is ""
			{
				continue; // skip the current iteration
			}
			
			System.out.println(product.toUpperCase());
			
		}
		
	}

}
