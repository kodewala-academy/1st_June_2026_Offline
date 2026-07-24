package com.kodewala.payment.inf3;

/**
 * @author Suresh.bishnoi
 */
class Employee implements Cloneable  { // This class has not given permission to clone the object of it.
	String name;
	String location;

	public Employee(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

/**
 * @author Rohit.kumar
 */
public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee("Ajay", "BLR"); // Created an object 

		Employee e2 = (Employee) e1.clone(); // copied the object --> Cloning means --> Copying the object
		System.out.println(e2.location + " " + e2.name);
		
		GoldUser goldUser = new GoldUser();
		if(goldUser instanceof User)
		{
			System.out.println(" gold user is type of User");
		}
		else
		{
			System.out.println(" NO....");
		}

	}

}
