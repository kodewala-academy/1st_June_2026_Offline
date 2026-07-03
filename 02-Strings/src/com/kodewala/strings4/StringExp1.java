package com.kodewala.strings4;

public class StringExp1 {

	public static void main(String[] args) {
		
		String name ="sachin"; // XYZ
		
		String o1= new String("Sachin"); // ABC 2 --> Heap(Sachin) + Scp(Sachin)
		
		String o2= new String("Sachin"); // DEF
		
		String o3= new String("Sachin");// ZYZ
		
		System.out.println(o3);
		// String o2= new String("Sachin");  // X10 -->  
	} // 

}
