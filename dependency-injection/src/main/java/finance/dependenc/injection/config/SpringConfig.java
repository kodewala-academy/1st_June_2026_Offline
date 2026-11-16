package finance.dependenc.injection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import finance.dependenc.injection.beans.Address;
import finance.dependenc.injection.beans.Address1;
import finance.dependenc.injection.beans.Employee;
import finance.dependenc.injection.beans.Employee1;

@Configuration
public class SpringConfig {
	@Bean
	public Address address() 
	{
      return new Address("27th main", "16th corss", "BTM Bangalore");
	}
	
	@Bean
	public Employee employee()
	{
		Employee employee = new Employee("Kodewala", "Academy", "KW1123", address());
		return employee;
	}

	

	@Bean
	public Address1 address1() 
	{
      return new Address1("27th main", "16th corss", "BTM Bangalore, indiaaaaa");
	}
	
	@Bean
	public Employee1 employee1()
	{
		Employee1 employee = new Employee1("Kodewala", "Academy", "KW1123");
		employee.setAddress(address1());
		return employee;
	}


}
