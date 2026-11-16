package finance.dependenc.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import finance.dependenc.injection.beans.Employee3;
import finance.dependenc.injection.config.SpringConfigFieldType;

public class App {
	public static void main(String[] args) 
	{/*
		 * ApplicationContext applicationContext = new
		 * AnnotationConfigApplicationContext(SpringConfig.class);
		 * 
		 * Employee1 emp = applicationContext.getBean(Employee1.class);
		 * 
		 * String result = emp.displayEmplpyee(); System.out.println(result);
		 */
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfigFieldType.class);

		Employee3 emp = applicationContext.getBean(Employee3.class);
		
		String result =  emp.displayEmplpyee();
		System.out.println(result);
		
		

	}
}
