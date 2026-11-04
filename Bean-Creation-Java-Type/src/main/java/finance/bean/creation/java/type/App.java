package finance.bean.creation.java.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import finance.bean.creation.java.type.config.SpringConfig;
import finance.bean.creation.java.type.emp.Employee;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Creating Spring Bean Using Java!!!!!" );
        
        ApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);
        
        Employee emp =  (Employee) ioc.getBean("emp2"); // Requesting the bean
        
        String result =emp.toString();
        System.out.println(result);
        
    }
}
