package finance.bean.creation.multiple.type;

public class Employee {

	String firstName;
	String lastName;

	public Employee(String firstName, String lastName) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void display() 
	{
		System.out.println("Employee.display() START");
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println("Employee.display() END");
	}
}
