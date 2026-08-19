package com.kodewala.collection.fw.set2;

import java.util.HashSet;

public class Driver {

	public static void main(String[] args) 
	{
	 
		HashSet<String> product = new HashSet<String>();
		
		product.add("iPhone17");// How add methods works internally.
		product.add("samsungs26");
		product.add("lg32");
		product.add("mac-pro324");
		// 
		int hash = "mac-pro324".hashCode();
		int spreadHash = hash ^(hash >>> 16);
        int bucketNumber = spreadHash & 15;
        System.out.println(" bucket number is "+bucketNumber);
        System.out.println(product.contains("iPhone17")); // O(1)
	}

}
