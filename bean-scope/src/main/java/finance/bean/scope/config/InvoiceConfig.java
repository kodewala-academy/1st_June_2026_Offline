package finance.bean.scope.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import finance.bean.scope.pojo.Invoice;

@Configuration
public class InvoiceConfig 
{

	@Bean("inv")
	@Scope("prototype") // new bean will be created whenever requested
	public Invoice invoice()
	{
		return new Invoice("INV1234", "Kodewala Academy");
	}
	
}
