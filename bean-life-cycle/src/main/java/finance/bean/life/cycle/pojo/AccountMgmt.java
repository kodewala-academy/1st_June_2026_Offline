package finance.bean.life.cycle.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class AccountMgmt  // Single 
{
   @Autowired
   Account account; // prototype
   
   public void showInfo()
   {
	   System.out.println("AccountMgmt.showInfo()");
	   account.openAccount();
   }
}
