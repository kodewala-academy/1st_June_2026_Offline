package com.kodewala.collection.fw.set1;

import java.util.HashSet;

public class Driver {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>(); // cap : 16

		set.add("BLR"); // Return ?

		// 1. calculate the hash code for the element
		int hash = "BLR".hashCode(); //  9th index

		int spreadHash = hash ^ (hash >>> 16);

		int bucket = spreadHash & (16 - 1);

		System.out.println(" bucket is : " + bucket);

		System.out.println(hash);

		set.add("CHE");
		set.add("HYD");
		set.add("BBR");
		set.add("BLR"); //  9th index
		set.add("DL");
		set.add("GGN");
		set.add("AHM");
		System.out.println(set); // stored only unique elements
	}

}
