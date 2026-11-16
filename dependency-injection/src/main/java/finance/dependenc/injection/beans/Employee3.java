package finance.dependenc.injection.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee3 {
	String firstName;
	String lastName;
	String empCode;

	@Autowired // Field Injection (Reflection API )
	Address3 address;

	public String displayEmplpyee() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", empCode=" + empCode + ", address="
				+ address.displayAddress() + "]";
	}

}
