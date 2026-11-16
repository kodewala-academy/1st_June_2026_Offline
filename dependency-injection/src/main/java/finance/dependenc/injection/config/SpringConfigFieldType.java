package finance.dependenc.injection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import finance.dependenc.injection.beans.Address3;
import finance.dependenc.injection.beans.Employee;
import finance.dependenc.injection.beans.Employee3;

@Configuration
public class SpringConfigFieldType {
	@Bean
	public Address3 address() 
	{
      return new Address3("27th main", "16th corss", "BTM Bangalore................");
	}
	
	@Bean
	public Employee3 employee()
	{
		Employee3 employee = new Employee3();
		return employee;
	}

}
