package finance.emp;

import org.springframework.stereotype.Component;

@Component // Asking SF to manage the bean of Employee
public class Employee 
{
	private String name;
	private String id;
	private String band;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", band=" + band + "]";
	}


}
