package com.kodewala.collection.fw.linkedlist1;

import java.util.LinkedList;
import java.util.List;

public class Driver {
	public static void main(String[] args) 
	{
     // Create linkedlist object which can store string elements
		
		List<String> linkedList = new LinkedList<String>();
		
	//	LinkedList<String> linkedList = new LinkedList<String>(); // Super s = new Child();
		
		// Add an elements
		
		linkedList.add("BLR"); // null -->|prev|Node1(BLR)|next| <--> |prev|Node2(CHE)|next| <--> ....
		linkedList.add("CHE");
		linkedList.add("HYD");
		linkedList.add("DEL");
		linkedList.add("MUM");
		linkedList.add("DEL");
		
		// Ordered and Duplicate
		System.out.println(linkedList);
		// read an element
		System.out.println(linkedList.get(2)); // index is position --> O(N)
		
	}
}
