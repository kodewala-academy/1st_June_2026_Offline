package finance.bean.life.cycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import finance.bean.life.cycle.pojo.Account;

@Configuration
@ComponentScan(basePackages = "finance.bean.life.cycle")
public class SpringConfig {

	@Bean
	@Scope("prototype")
	public Account account()
	{
		Account account = new Account("3456765434567", "Kodewala");
		return account;
	}

}
