package finance.bean.creation.multiple.type.confirg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import finance.bean.creation.multiple.type.Employee;

@Configuration
@ComponentScan(basePackages = "finance.bean.creation.multiple.type")
public class SpringConfig {
	@Bean("EMP1")

	public Employee employee1() {
		Employee emp = new Employee("Kodewala", "Academy");
		return emp;
	}

	@Bean("EMP2")
	@Primary
	public Employee employee2() {
		Employee emp = new Employee("New Kodewala", " New Academy");
		return emp;
	}
}
