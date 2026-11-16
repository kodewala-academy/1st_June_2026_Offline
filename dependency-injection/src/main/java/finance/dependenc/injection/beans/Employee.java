package finance.dependenc.injection.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	String firstName;
	String lastName;
	String empCode;
	
	@Autowired
	Address address;

	public Employee(String firstName, String lastName, String empCode, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empCode = empCode;
		this.address = address;
	}


	public String displayEmplpyee() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", empCode=" + empCode + ", address="
				+ address.displayAddress() + "]";
	}

}
