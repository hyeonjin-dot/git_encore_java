package workshop4.grade.entity;

public class Employee {
	
	protected String	name;
	protected String	employeeNo;
	protected int 		age;
	
	public Employee(String n, String e, int a) {
		this.name = n;
		this.employeeNo = e;
		this.age = a;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getEmployeeNo() {
		return employeeNo;
	}
	
	public void setEmployeeNo(String n) {
		employeeNo = n;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(int n) {
		age = n;
	}
}
