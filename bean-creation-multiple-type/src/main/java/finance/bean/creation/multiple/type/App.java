package finance.bean.creation.multiple.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import finance.bean.creation.multiple.type.components.EmployeeMgmt;
import finance.bean.creation.multiple.type.confirg.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext applicationContext =new AnnotationConfigApplicationContext(SpringConfig.class);
       
       EmployeeMgmt employeeMgmt =  applicationContext.getBean(EmployeeMgmt.class);
       employeeMgmt.displayDetails();
    }
}
