package com.infosys.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infosys.employee.Employee;

public class Driver {

	public static void main(String[] args) 
	{
		String configPath  = "beans.xml";
		
		// Create an IOC Container
		
		ApplicationContext iocContainer = new ClassPathXmlApplicationContext(configPath);
		
		Employee employee =  (Employee) iocContainer.getBean("emp1");
		
		System.out.println(employee.getName());

	}

}
