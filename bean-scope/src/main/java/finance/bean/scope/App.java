package finance.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import finance.bean.scope.config.InvoiceConfig;
import finance.bean.scope.pojo.Invoice;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext container = new AnnotationConfigApplicationContext(InvoiceConfig.class);
     
       // Requesting invoice bean from an ioc container
       Invoice invoice1 = (Invoice) container.getBean("inv");
       invoice1.showInvoice();
       
    // Requesting invoice bean from an ioc container
       Invoice invoice2 = (Invoice) container.getBean("inv");
       
       System.out.println(invoice1 == invoice2); // default scope is singleton so no new bean created.
    }
}
