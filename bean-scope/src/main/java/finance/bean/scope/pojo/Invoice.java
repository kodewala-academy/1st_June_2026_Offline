package finance.bean.scope.pojo;

public class Invoice 
{
	private String invId;
	private String customerName;

	public void showInvoice() 
	{
		String data = "Invoice [invId=" + invId + ", customerName=" + customerName + "]";
		System.out.println(data);
	}

	public Invoice(String invId, String customerName) {
		super();
		this.invId = invId;
		this.customerName = customerName;
	}

	
	
}
