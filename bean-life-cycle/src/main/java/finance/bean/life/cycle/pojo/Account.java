package finance.bean.life.cycle.pojo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Account implements InitializingBean , DisposableBean
{
  private String accountNumber;
  private String name;
  
  public Account(String accountNumber, String name) 
  {
	super();
	System.out.println("1. Account(String accountNumber, String name)  Constructor....");
	this.accountNumber = accountNumber;
	this.name = name;
  }
  
  @PostConstruct
  public void init()
  {
	  System.out.println("2. inside init...");
  }
  
  public void openAccount()
  {
	  System.out.println("4. Using the bean --> Account.openAccount().. opening account");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
	System.out.println("3. Account.afterPropertiesSet()....");
	
  }

  @PreDestroy
  public void cleanup()
  {
	  System.out.println("5. doing cleanup");
  }
  
  @Override
  public void destroy() throws Exception 
  {
	System.out.println("6. Account.destroy().................");
	
  }
}
