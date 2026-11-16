package finance.dependenc.injection.beans;

public class Employee1 {
	String firstName;
	String lastName;
	String empCode;
	Address1 address;

	public Employee1(String firstName, String lastName, String empCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empCode = empCode;
		
	}

    public void setAddress(Address1 address1)
    {
    	this.address=address1;
    }
	public String displayEmplpyee() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", empCode=" + empCode + ", address="
				+ address.displayAddress() + "]";
	}

}
