package workshop5.hrsystem.entity;

import lombok.Getter;
import lombok.Setter;

public class Person {
	
	@Getter @Setter
	private String	name;
	@Getter 
	private char 	gender;
	private String	ssn;
	@Getter @Setter
	private String	address;
	@Getter @Setter
	private String	phone;
	
	public Person() {}
	
	public Person(String n, String s, String a, String p) {
		this.name = n;
		this.ssn = s;
		this.address = a;
		this.phone = p;
	}
	
	public void setGender() {
		switch(getSSN().charAt(7)){
		case '1': case '3': 
			gender = '남';
			break;
		case '2': case '4': 
			gender = '여';
			break;
		}
	}
	
	public String getSSN() {
		return ssn;
	}
	
	public void setSSN(String s) {
		ssn = s;
	}
}
