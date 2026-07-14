package com.kodewala.inh1;



public class Employee
{

}


class Manager extends Employee // Manager IS-A Employee
{

	public static void main(String[] args) 
	{
		Manager e1 = new Manager();
		int      a  = 10;
		
	    // up casting
		Employee e2 =(Employee) new Manager(); // Super/Parent class can refer child class object
		
		// let child class refer the parent class object
		
	    Manager mgr	=(Manager) new Employee(); // down casting
		
	}
	
}

