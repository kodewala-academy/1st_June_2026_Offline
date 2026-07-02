package com.kodewala.strings3;

class Employee extends Object {

}

public class Driver {
	public static void main(String[] args) 
	{
      Employee e1 = new Employee(); // Heap --> XYZ123
      Employee e2 = new Employee(); // Heap -> ABC123
      System.out.println(e1 == e2);  // fAlse
      System.out.println(e1.equals(e2)); // 
	}
}
