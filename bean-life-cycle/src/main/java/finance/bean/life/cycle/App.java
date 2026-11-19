package finance.bean.life.cycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import finance.bean.life.cycle.config.SpringConfig;
import finance.bean.life.cycle.pojo.AccountMgmt;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext(SpringConfig.class);
       AccountMgmt accountMgmt = context.getBean(AccountMgmt.class);
       accountMgmt.showInfo();
       
       AccountMgmt accountMgmt1 = context.getBean(AccountMgmt.class);
       accountMgmt1.showInfo();
     //  context.close();
    }
}
