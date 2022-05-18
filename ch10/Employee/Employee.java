package Employee;

public class Employee {
	private String name;
	private String number;
	private String hireDate;
	
	public Employee() {
		name = "";
		number = "";
		hireDate = "";
	}
	
	public Employee(String a, String b, String c) {
		name = a;
		number = b;
		hireDate = c;
	}

	public void setName(String a) {
		name = a;
	}
	
	public void setNumber(String b) {
		number = b;
	}
	
	public void setHireDate(String c) {
		hireDate = c;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNumber() {
		return number;
	}
	
	public String getHireDate() {
		return hireDate;
	}
}
