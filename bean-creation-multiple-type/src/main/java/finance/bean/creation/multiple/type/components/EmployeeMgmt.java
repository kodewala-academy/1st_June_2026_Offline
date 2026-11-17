package finance.bean.creation.multiple.type.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import finance.bean.creation.multiple.type.Employee;

@Component
public class EmployeeMgmt {

	@Autowired
	@Qualifier("EMP1")
	Employee employee; 
	// trying to inject the employee bean --> it will check with IOC and request for employee bean
	// Now IOC containertry to check the bean with employee type
	

	public void displayDetails() 
	{
		System.out.println("EmployeeMgmt.displayDetails() START");
		employee.display();
		System.out.println("EmployeeMgmt.displayDetails() END");
	}

}
