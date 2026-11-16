package finance.dependenc.injection.beans;

public class Address {

	String line1;
	String line2;
	String city;
	
	public Address(String line1, String line2, String city) 
	{
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
	}


	public String displayAddress() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", city=" + city + "]";
	}
	
	
}
