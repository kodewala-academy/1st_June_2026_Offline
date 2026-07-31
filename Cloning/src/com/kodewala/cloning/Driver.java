package com.kodewala.cloning;

class Address implements Cloneable {
	String line1;

	public Address(String line1) {
		super();
		this.line1 = line1;
	}

	@Override
	public Address clone() throws CloneNotSupportedException {
		return (Address) super.clone();
	}

}

class Employee implements Cloneable {

	String name;
	Address address;

	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	public Employee clone() throws CloneNotSupportedException 
	{
		// cloning the employee
		Employee emp = (Employee) super.clone();
		// cloning the address(deep cloning)
		emp.address = this.address.clone();

		return emp;
	}

}

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {

		Address address = new Address("BTM 2nd Stage"); // in case of shallow coning this remains shared(common)

		Employee e1 = new Employee("Donni", address);

		Employee e2 = e1.clone();

		// Modifying the line1 of address
		e2.address.line1 = "Test Stage";

		System.out.println(" Original Obj : " + e1.name);
		System.out.println(" Original Obj : " + e1.address.line1);

		System.out.println(" Cloned Obj : " + e2.name);
		System.out.println(" Cloned Obj : " + e2.address.line1);

	}
}
