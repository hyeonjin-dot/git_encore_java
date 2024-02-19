package workshop4.grade.entity;

public class Student extends Employee {
	private int	oracle;
	private int	java;
	private int servlet;
	
	public Student(String n, String e, int a, int o, int j, int s) {
		super(n, e, a);
		this.oracle = o;
		this.java = j;
		this.servlet = s;
	}
	
	public int getOracle() {
		return oracle;
	}
	
	public void setOracle(int o) {
		oracle = o;
	}
	
	public int getJava() {
		return java;
	}
	
	public void setJava(int o) {
		java = o;
	}
	
	public int getServlet() {
		return servlet;
	}
	
	public void setServlet(int o) {
		servlet = o;
	}
	
	public int getTotal() {
		int res = 0; 
		res = oracle + java + servlet;
		return res;
	}
	
	public double getAverage() {
		return getTotal()/3.0;
	}
	
	public String toString() {
		return String.format("%s %d %d %d %d %.1f", 
				this.getName(), getOracle(), getJava(), getServlet(),
				getTotal(), getAverage());
	}
}
