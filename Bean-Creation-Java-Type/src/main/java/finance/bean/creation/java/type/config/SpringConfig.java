package finance.bean.creation.java.type.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import finance.bean.creation.java.type.emp.Employee;

@Configuration // This class is the source of bean defintion 
public class SpringConfig 
{
	@Bean("emp1") // telling spring framework to manage the employee bean
    public Employee createEmp()
    {
    	Employee employee = new Employee();
    	employee.setBand("B1");
    	employee.setId("KW123");
    	employee.setName("Kodewala Academy");
    	return employee;
    }
	
	@Bean("emp2") // telling spring framework to manage the employee bean
    public Employee createEmp1()
    {
    	Employee employee = new Employee();
    	employee.setBand("B2");
    	employee.setId("KW1234");
    	employee.setName("Kodewala Academym, BTM Bangalore");
    	return employee;
    }
}
