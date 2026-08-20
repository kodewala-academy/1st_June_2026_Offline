package com.kodewala.collection.fw.set5;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
        int result = Integer.compare(this.id, o.id);
        System.out.println(this.id+" , " +o.id + " and result is "+result);
		return result;
	}

}

public class Driver {

	public static void main(String[] args) {

		Set<String> cities = new TreeSet<String>();
		cities.add("BLR");
		cities.add("GGN");
		cities.add("DL");
		cities.add("HYD");
		cities.add("HYD");
		cities.add("CHE");
		cities.add("AHM");
		cities.add("AHM");

		System.out.println(cities);

		Set<Employee> empSet = new TreeSet<Employee>();
		System.out.println("===========================================");
		empSet.add(new Employee(123, "Kodewala"));
		empSet.add(new Employee(12, "Acadmey"));
		empSet.add(new Employee(412, "BTM"));
		empSet.add(new Employee(16, "BTM"));
		empSet.add(new Employee(16, "BTM"));

		for (Employee employee : empSet) {
			System.out.println(employee.id + " , " + employee.name);
		}
	}

}
