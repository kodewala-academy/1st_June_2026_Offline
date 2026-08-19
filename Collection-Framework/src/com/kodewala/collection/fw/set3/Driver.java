package com.kodewala.collection.fw.set3;

import java.util.HashSet;
import java.util.Set;

class Employee {
	private String name;
	private int id;
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + this.id;
	}

	@Override
	public boolean equals(Object obj) {

		Employee emp = (Employee) obj;
		return this.name.equals(emp.name) & this.id ==emp.id;
	}
}

public class Driver {

	public static void main(String[] args) {
		Set<Employee> employees = new HashSet<Employee>();

		Employee e1 = new Employee("Kodewala", 123); // 255282244
		Employee e2 = new Employee("Kodewala", 4321); // 255282244
	
		System.out.println(" e1 :" + e1.hashCode() + " , e2 " + e2.hashCode());
		System.out.println(e1.equals(e2));

		employees.add(e1);
		employees.add(e2);
		
		
		System.out.println(employees); // Both will be stored
	}

}
