package com.kodewala.collection.fw.set3;

import java.util.HashSet;
import java.util.Set;

class Employee1 {
	private String name;
	private int id;

	public Employee1(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public int hashCode() {
		return 987654321;
	}

}

public class Driver2 {

	public static void main(String[] args) {
		Set<Employee1> employees = new HashSet<Employee1>(64); // 1000 objects --> 100 col

		Employee1 e1 = new Employee1("Kodewala", 123); 
		Employee1 e2 = new Employee1("Kodewala", 123); 
		Employee1 e3 = new Employee1("Kodewala", 123); 
		Employee1 e4 = new Employee1("Kodewala", 123); 
		Employee1 e5 = new Employee1("Kodewala", 123); 
		Employee1 e6 = new Employee1("Kodewala", 123); 
		Employee1 e7 = new Employee1("Kodewala", 123); 
		Employee1 e8 = new Employee1("Kodewala", 123); 
		Employee1 e9 = new Employee1("Kodewala", 123); 
		

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		employees.add(e8);
		employees.add(e9);

		System.out.println(employees); // Both will be stored
	}

}
